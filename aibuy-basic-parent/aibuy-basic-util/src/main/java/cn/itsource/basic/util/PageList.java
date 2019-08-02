package cn.itsource.basic.util;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {

    private Long tolal;
    private List<T> rows =new ArrayList<T>();

    public PageList() {
    }

    public PageList(Long tolal, List<T> rows) {
        this.tolal = tolal;
        this.rows = rows;
    }

    public Long getTolal() {
        return tolal;
    }

    public void setTolal(Long tolal) {
        this.tolal = tolal;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
