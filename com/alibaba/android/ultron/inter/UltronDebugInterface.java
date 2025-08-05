package com.alibaba.android.ultron.inter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public interface UltronDebugInterface extends Serializable {
    void destroy();

    String getBizName();

    Context getContext();

    void init(Context context);

    boolean isConnectedStudio();

    void onCreate();

    void onPause();

    void onResume();

    void registerStatusCallback(String str, com.alibaba.android.ultron.inter.a aVar);

    void registerStatusListener(com.alibaba.android.ultron.inter.a aVar);

    void sendStatusCallback(String str, Map<String, Object> map);

    void sendStatusEvent(String str, Map<String, Object> map);

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f2653a = new HashMap();

        static {
            kge.a(-8006586);
        }

        public Map<String, Object> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f2653a;
        }

        public a a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bba29d3b", new Object[]{this, str, obj});
            }
            this.f2653a.put(str, obj);
            return this;
        }
    }
}
