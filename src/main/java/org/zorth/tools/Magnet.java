package org.zorth.tools;

/**
 * @author nicolas
 */
public class Magnet {

    /**
     * 磁力链接头部
     */
    private final String magnetString = "magnet:?xt=urn:btih:";

    /**
     * 清洗输入的磁力链接中的空格
     * @param input 输入的磁力链接
     * @return 清洗后的磁力链接
     */
    public String clearInput(String input) {
        // 将中文空格替换为英文空格
        input = input.replace((char) 12288, ' ');
        return input.trim();
    }


    /**
     * 拼接磁力链接
     * @param input
     * @return
     */
    public String splicingMagnet(String input) {
        input = magnetString + clearInput(input);
        return input;
    }

}
