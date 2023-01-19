package programmers.kakaoBlind2023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class 개인정보_수집_유효기간 {

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        개인정보_수집_유효기간 a = new 개인정보_수집_유효기간();
        a.solution(today, terms, privacies);
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> answer = new ArrayList<>();
        // 오늘 날짜를 Localdate로 파싱
        LocalDate current = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        // terms에서 문자와 기간 파싱
        Map<String, Integer> termsMap = new HashMap();
        for (String term : terms) {
            String[] s = term.split(" ");
            termsMap.put(s[0], Integer.valueOf(s[1]));
        }

        // Privacy 에서 날짜와 term 파싱
        Map<String, String> privacyMap = new HashMap<>();
        for (String privacy : privacies) {
            String[] s = privacy.split(" ");
            privacyMap.put(s[0], s[1]);
        }

        int count = 1;
        for (String privacy : privacies) {
            String[] s = privacy.split(" ");
            LocalDate privacyDate = LocalDate.parse(s[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            Integer term = termsMap.get(s[1]);
            System.out.println("Terms 더한 날짜 :: " + privacyDate.plusMonths(term).toString() + " 오늘" +current);
            System.out.println("기한 지났는지 :: " + privacyDate.plusMonths(term).isAfter(current));
            if (privacyDate.plusMonths(term).isBefore(current)) {
                answer.add(count);
            }
            count++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
