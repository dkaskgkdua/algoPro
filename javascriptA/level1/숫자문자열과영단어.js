// https://programmers.co.kr/learn/courses/30/lessons/81301?language=javascript

function solution(s) {
    s = s.toString();
    const result = s
        .replace(/zero/g, "0")
        .replace(/one/g, "1")
        .replace(/two/g, "2")
        .replace(/three/g, "3")
        .replace(/four/g, "4")
        .replace(/five/g, "5")
        .replace(/six/g, "6")
        .replace(/seven/g, "7")
        .replace(/eight/g, "8")
        .replace(/nine/g, "9");
}
solution("one4seveneight");
solution("23four5six7");
solution("2three45sixseven");
solution(123);