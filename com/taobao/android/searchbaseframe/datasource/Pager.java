package com.taobao.android.searchbaseframe.datasource;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class Pager implements IPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_PAGE_SIZE = 10;
    private int totalNum = 0;
    private int currentPage = 0;
    private int currentPhysicsPage = 0;
    private boolean finished = false;
    private int pageSize = 10;

    static {
        kge.a(-1255018425);
        kge.a(-467146538);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getNextStartIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fd031d3", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.currentPage = 0;
        this.currentPhysicsPage = 0;
        this.totalNum = 0;
        this.finished = false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void resetWithAssignPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe9ee89", new Object[]{this, new Integer(i)});
            return;
        }
        this.currentPage = Math.max(i, 0);
        this.currentPhysicsPage = 0;
        this.totalNum = 0;
        this.finished = false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getPageNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
        }
        int i = this.totalNum;
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        int i2 = this.pageSize;
        if (i % i2 > 0) {
            return (i / i2) + 1;
        }
        return i / i2;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b10497b", new Object[]{this});
        } else {
            this.finished = true;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setNotFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a981aa", new Object[]{this});
        } else {
            this.finished = false;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public boolean hasNextPage() {
        int pageNum;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue() : !this.finished && (pageNum = getPageNum()) > 0 && this.currentPage < pageNum;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getNextPageNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8da1ac48", new Object[]{this})).intValue() : this.currentPage + 1;
    }

    public int getNextPhysicsPageNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ec7e9f3", new Object[]{this})).intValue() : this.currentPhysicsPage + 1;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getTotalNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1d792", new Object[]{this})).intValue() : this.totalNum;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setTotalNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5ff5b8", new Object[]{this, new Integer(i)});
        } else {
            this.totalNum = i;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue() : this.pageSize;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setPageSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ec8ea", new Object[]{this, new Integer(i)});
        } else {
            this.pageSize = i;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void increasePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f787f8", new Object[]{this});
            return;
        }
        this.currentPage++;
        this.currentPhysicsPage++;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void decreasePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6677654", new Object[]{this});
            return;
        }
        this.currentPage--;
        this.currentPhysicsPage--;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue() : this.currentPage;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public void setCurrentPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18fd536", new Object[]{this, new Integer(i)});
        } else {
            this.currentPage = i;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public int getCurrentPhysicsPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd5dcb2d", new Object[]{this})).intValue() : this.currentPhysicsPage;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.IPager
    public boolean serverFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f1e72e0", new Object[]{this})).booleanValue() : this.finished;
    }
}
