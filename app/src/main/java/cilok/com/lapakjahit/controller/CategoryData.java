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
        list.add(new CategoryType("Kategory Pria", 164, CategoryType.TITLE_TYPE,0));
        list.add(new CategoryType("Baju_Koko", 2411, CategoryType.CATEGORY_TYPE,2));
        list.add(new CategoryType("Tuxedo", 564, CategoryType.CATEGORY_TYPE,4));
        list.add(new CategoryType("Kemeja", 296, CategoryType.CATEGORY_TYPE,1));
        list.add(new CategoryType("Jas", 297, CategoryType.CATEGORY_TYPE,5));
        list.add(new CategoryType("Jaket", 298, CategoryType.CATEGORY_TYPE,9));
        list.add(new CategoryType("Kaos", 165, CategoryType.CATEGORY_TYPE,7));
        list.add(new CategoryType("Jeans", 1093, CategoryType.CATEGORY_TYPE,8));
        list.add(new CategoryType("Celana_Dasar", 2599, CategoryType.CATEGORY_TYPE,3));
        list.add(new CategoryType("Topi", 304, CategoryType.CATEGORY_TYPE,6));
        list.add(new CategoryType("Kategory_Wanita", 159, CategoryType.TITLE_TYPE,-1));
        list.add(new CategoryType("Kebaya", 286, CategoryType.CATEGORY_TYPE,10));
        list.add(new CategoryType("Gaun", 0, CategoryType.CATEGORY_TYPE,13));
        list.add(new CategoryType("Dress", 14, CategoryType.CATEGORY_TYPE,12));
        list.add(new CategoryType("Blazer", 0, CategoryType.CATEGORY_TYPE,11));
        list.add(new CategoryType("Kemeja", 282, CategoryType.CATEGORY_TYPE,17));
        list.add(new CategoryType("Kaos", 281, CategoryType.CATEGORY_TYPE,18));
        list.add(new CategoryType("Jeans", 1093, CategoryType.CATEGORY_TYPE,15));
        list.add(new CategoryType("Celana_Dasar", 2519, CategoryType.CATEGORY_TYPE,16));
        list.add(new CategoryType("Rok", 287, CategoryType.CATEGORY_TYPE,14));
        return list;
    }
}
