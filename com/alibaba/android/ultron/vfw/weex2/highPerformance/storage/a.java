package com.alibaba.android.ultron.vfw.weex2.highPerformance.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<UltronTradeHybridStorage> f2804a = new CopyOnWriteArrayList();

    static {
        kge.a(-265205312);
    }

    public UltronTradeHybridStorage a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridStorage) ipChange.ipc$dispatch("b8054f5f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridStoragePool.getStorage", "key is empty");
            return null;
        }
        UltronTradeHybridStorage c = c(str);
        if (c == null) {
            UnifyLog.b("UltronTradeHybridStoragePool.getStorage", "target is null");
            return null;
        } else if (!c.isExpired()) {
            return c;
        } else {
            UnifyLog.b("UltronTradeHybridStoragePool.getStorage", "target is expired");
            return null;
        }
    }

    public void a(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60825986", new Object[]{this, str, jSONObject, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridStoragePool.setStorage", "key is empty");
        } else {
            UltronTradeHybridStorage c = c(str);
            if (c == null) {
                this.f2804a.add(new UltronTradeHybridStorage(str, jSONObject, j));
            } else {
                c.update(jSONObject, j);
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridStoragePool.setStorage", "key is empty");
        } else {
            UltronTradeHybridStorage c = c(str);
            if (c == null) {
                UnifyLog.b("UltronTradeHybridStoragePool.deleteStorage", "target is null");
            } else {
                this.f2804a.remove(c);
            }
        }
    }

    private UltronTradeHybridStorage c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridStorage) ipChange.ipc$dispatch("7a1dc461", new Object[]{this, str});
        }
        for (UltronTradeHybridStorage ultronTradeHybridStorage : this.f2804a) {
            if (ultronTradeHybridStorage != null && TextUtils.equals(ultronTradeHybridStorage.getKey(), str)) {
                return ultronTradeHybridStorage;
            }
        }
        return null;
    }
}
