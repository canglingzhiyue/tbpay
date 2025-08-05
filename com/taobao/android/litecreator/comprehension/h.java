package com.taobao.android.litecreator.comprehension;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.windvane.LCComprehensionRecommendPlugin;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001eR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006!"}, d2 = {"Lcom/taobao/android/litecreator/comprehension/ContentCacheManager;", "", "()V", "audioCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getAudioCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "labelResultCache", "", "getLabelResultCache", "localPathsCache", "getLocalPathsCache", "submitWorkflowDatas", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/android/litecreator/comprehension/SubmitWorkflowData;", "getSubmitWorkflowDatas", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "uploadImageUrlCache", "getUploadImageUrlCache", "addLabelResult", "", "mediaId", LCComprehensionRecommendPlugin.METHOD_NAME_QUERY_RESULT, "(Ljava/lang/Integer;Ljava/lang/String;)V", "addLocalPath", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, "clearAll", "clearLabelResult", "getLabelResult", "(Ljava/lang/Integer;)Ljava/lang/String;", "getLocalPath", "getUploadedUrlByMediaId", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, String> f13333a;
    private static final ConcurrentHashMap<Integer, String> b;
    private static final ConcurrentHashMap<String, String> c;
    private static final ConcurrentHashMap<String, String> d;
    private static final CopyOnWriteArrayList<Object> e;

    static {
        kge.a(524747189);
        INSTANCE = new h();
        f13333a = new ConcurrentHashMap<>();
        b = new ConcurrentHashMap<>();
        c = new ConcurrentHashMap<>();
        d = new ConcurrentHashMap<>();
        e = new CopyOnWriteArrayList<>();
    }

    private h() {
    }

    public final ConcurrentHashMap<Integer, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : f13333a;
    }

    public final ConcurrentHashMap<Integer, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ba6647dd", new Object[]{this}) : b;
    }

    public final ConcurrentHashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("7d52b13c", new Object[]{this}) : c;
    }

    public final ConcurrentHashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("403f1a9b", new Object[]{this}) : d;
    }

    public final String a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3baa0f71", new Object[]{this, num});
        }
        if (num != null && num.intValue() > 0) {
            return f13333a.get(num);
        }
        return null;
    }

    public final String b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c84a3a72", new Object[]{this, num});
        }
        if (num != null && num.intValue() > 0) {
            return b.get(num);
        }
        return null;
    }

    public final void a(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de586919", new Object[]{this, num, str});
        } else if (num == null || str == null) {
        } else {
            f13333a.put(num, str);
        }
    }

    public final void b(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bd9e38", new Object[]{this, num, str});
        } else if (num == null || str == null) {
        } else {
            b.put(num, str);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            b.clear();
        }
    }

    public final String c(Integer num) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54ea6573", new Object[]{this, num});
        }
        if (num != null && num.intValue() > 0 && (str = f13333a.get(num)) != null) {
            return c.get(str);
        }
        return null;
    }
}
