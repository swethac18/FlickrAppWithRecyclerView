package sample.app.flickrlikeapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by swetha on 5/11/19.
 */

public class Photos{

    private Integer page;
    private Integer pages;
    private Integer perpage;
    private Integer total;
    private List<Photo> photo = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPerpage() {
        return perpage;
    }

    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

}
