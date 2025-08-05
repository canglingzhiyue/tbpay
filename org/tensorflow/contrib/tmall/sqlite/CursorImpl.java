package org.tensorflow.contrib.tmall.sqlite;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class CursorImpl implements Cursor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int columnCount;
    private int currentRow = -1;
    private ArrayList<ArrayList<String>> rawData;
    private final int rowCount;

    static {
        kge.a(-252373409);
        kge.a(-1996675169);
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getColumnIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac47bea", new Object[]{this, str})).intValue();
        }
        return -1;
    }

    public CursorImpl(ArrayList<ArrayList<String>> arrayList) {
        this.rawData = arrayList;
        int i = 0;
        this.rowCount = arrayList == null ? 0 : this.rawData.size();
        this.columnCount = this.rowCount != 0 ? this.rawData.get(0).size() : i;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public boolean moveToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aacf6c4a", new Object[]{this})).booleanValue();
        }
        if (!hasData()) {
            return false;
        }
        this.currentRow++;
        return this.currentRow < this.rawData.size();
    }

    private boolean hasData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15e54bef", new Object[]{this})).booleanValue() : this.rowCount > 0 && this.columnCount > 0;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getColumnCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue() : this.columnCount;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{this, new Integer(i)})).intValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Integer.parseInt(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        if (hasData() && i < this.columnCount) {
            return this.rawData.get(this.currentRow).get(i);
        }
        return null;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public long getLong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43ad79e", new Object[]{this, new Integer(i)})).longValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Long.parseLong(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public float getFloat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aecf2e66", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Float.parseFloat(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1.0f;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (!hasData()) {
            return 0;
        }
        return this.rawData.size();
    }
}
