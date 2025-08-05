package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class RPUploadTaskCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static RPUploadTaskCache mInstance;
    public final HashMap<String, Object> mCacheMap = new HashMap<>();

    public static RPUploadTaskCache getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPUploadTaskCache) ipChange.ipc$dispatch("ab771496", new Object[0]);
        }
        if (mInstance == null) {
            mInstance = new RPUploadTaskCache();
        }
        return mInstance;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        synchronized (this.mCacheMap) {
            this.mCacheMap.clear();
        }
    }

    public Set<Map.Entry<String, Object>> getAll() {
        Set<Map.Entry<String, Object>> entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("50ede1", new Object[]{this});
        }
        synchronized (this.mCacheMap) {
            entrySet = this.mCacheMap.entrySet();
        }
        return entrySet;
    }

    public Object getTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a4c71e66", new Object[]{this, str});
        }
        synchronized (this.mCacheMap) {
            if (!this.mCacheMap.containsKey(str)) {
                return null;
            }
            return this.mCacheMap.get(str);
        }
    }

    public void put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
            return;
        }
        synchronized (this.mCacheMap) {
            if (str != null && obj != null) {
                this.mCacheMap.put(str, obj);
            }
        }
    }

    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        synchronized (this.mCacheMap) {
            if (this.mCacheMap.containsKey(str)) {
                this.mCacheMap.remove(str);
            }
        }
    }
}
