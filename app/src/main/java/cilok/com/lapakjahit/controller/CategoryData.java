package cilok.com.lapakjahit.controller;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.entity.CategoryType;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class CategoryData {
    public static List<CategoryType> getData() {
        List<CategoryType> list = new ArrayList<>();
        list.add(new CategoryType("Kategory Pria", 164, CategoryType.TITLE_TYPE));
        list.add(new CategoryType("Baju Koko", 2411, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Tuxedo", 564, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Kemeja", 296, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Sweater", 297, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Jaket", 298, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Kaos", 165, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Jeans", 1093, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Celana Dasar", 2599, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Topi", 304, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Kategory Wanita", 159, CategoryType.TITLE_TYPE));
        list.add(new CategoryType("Kebaya", 286, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Gaun", 0, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Dress", 14, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Blazer", 0, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Kemeja", 282, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Kaos", 281, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Jeans", 1093, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Celana Dasar", 2519, CategoryType.CATEGORY_TYPE));
        list.add(new CategoryType("Rok", 287, CategoryType.CATEGORY_TYPE));
        return list;
    }
}
