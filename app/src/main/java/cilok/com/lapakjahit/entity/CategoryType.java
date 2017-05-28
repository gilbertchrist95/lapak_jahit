package cilok.com.lapakjahit.entity;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class CategoryType {
    public static final int TITLE_TYPE = 0;
    public static final int CATEGORY_TYPE = 1;

    private String mTitle;
    private int mCategoryId;
    private int mType;
    private int id_custom;


    public int getmCategoryId() {
        return mCategoryId;
    }

    public void setmCategoryId(int mCategoryId) {
        this.mCategoryId = mCategoryId;
    }




    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public CategoryType(String mTitle,int mCateogryId, int mType, int id_custom) {
        this.mTitle = mTitle;
        this.mCategoryId  = mCateogryId;
        this.mType = mType;
        this.id_custom = id_custom;
    }
}
