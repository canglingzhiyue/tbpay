package com.taobao.android.searchbaseframe.datasource;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface IPager extends Serializable {
    void decreasePage();

    int getCurrentIndex();

    int getCurrentPage();

    int getCurrentPhysicsPage();

    int getNextPageNum();

    int getNextStartIndex();

    int getPageNum();

    int getPageSize();

    int getTotalNum();

    boolean hasNextPage();

    void increasePage();

    void reset();

    void resetWithAssignPage(int i);

    boolean serverFinished();

    void setCurrentIndex(int i);

    void setCurrentPage(int i);

    void setFinished();

    void setNotFinished();

    void setPageSize(int i);

    void setTotalNum(int i);
}
