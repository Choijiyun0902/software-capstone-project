package com.jiyun.refrigerator;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {
    public String askAi(String items) {
        // 사용자가 입력한 재료 바탕으로 레시피 추천
        
        if (items.contains("계란")) {
            return "🍳 AI 요리사: [" + items + "] 재료라면 '폭신한 계란찜'이나 '계란말이'를 추천해요!";
        } else if (items.contains("스팸") || items.contains("햄")) {
            return "🥫 AI 요리사: [" + items + "] 재료라면 '스팸마요 덮밥'이나 '부대찌개'가 딱이네요!";
        } else if (items.contains("김치")) {
            return "🥘 AI 요리사: [" + items + "] 재료라면 '매콤한 김치볶음밥' 어떠신가요?";
        } else {
            return "🥗 AI 요리사: [" + items + "] 재료로 만들 수 있는 '건강한 채소 볶음' 레시피를 찾아볼게요!";
        }
    }
}
