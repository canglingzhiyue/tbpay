package com.taobao.tinct.impl.collect;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.qrn;
import tb.qro;

/* loaded from: classes.dex */
public class f extends ITinctOperater {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final List<BaseChangeInfo> f22954a = new ArrayList();

    /* renamed from: com.taobao.tinct.impl.collect.f$1 */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22955a = new int[ChangeType.values().length];

        static {
            try {
                f22955a[ChangeType.ORANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22955a[ChangeType.AB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22955a[ChangeType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$zGI7pdxdHz9Nrez3kv-Z6GzF5ns */
    public static /* synthetic */ void m1539lambda$zGI7pdxdHz9Nrez3kvZ6GzF5ns(CustomChangeInfo customChangeInfo) {
        b(customChangeInfo);
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markABUsed(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f910ddba", new Object[]{this, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
        } else {
            if (!qrn.a().get()) {
                a(ABChangeInfo.builder(str2, str3, str4).setBizName(str));
            } else if (!com.taobao.tinct.impl.config.a.c()) {
            } else {
                ABChangeInfo bizName = ABChangeInfo.builder(str2, str3, str4).setBizName(str);
                if (!b.a().a(bizName)) {
                    return;
                }
                e.a(bizName, e.UPLOAD_TYPE_EFFECT);
            }
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markOrangeUsed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e16fd3", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (!qrn.a().get()) {
                OrangeChangeInfo orangeChangeInfo = new OrangeChangeInfo();
                orangeChangeInfo.setNameSpace(str2);
                orangeChangeInfo.setBizName(str);
                a(orangeChangeInfo);
                return;
            }
            OrangeChangeInfo a2 = b.a().a(str2);
            if (a2 == null) {
                Log.e("TinctOperator", "Can't find the change info for: " + str2);
                return;
            }
            String.format("%s mark orange %s used.", str, str2);
            a2.setUsed(true);
            a2.setBizName(str);
            e.a(a2, e.UPLOAD_TYPE_EFFECT);
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markBatchTouchStoneUsed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4211a92b", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2) && qrn.a().get() && com.taobao.tinct.impl.config.a.f()) {
            List<String> j = com.taobao.tinct.impl.config.a.j();
            String[] split = str2.split("_");
            if (split.length <= 0 || j.isEmpty()) {
                return;
            }
            for (String str3 : split) {
                if (j.contains(String.format("ts|%s|%s", str, str3))) {
                    com.taobao.tinct.model.c cVar = new com.taobao.tinct.model.c(str, str3);
                    if (b.a().a(cVar)) {
                        e.a(cVar, e.UPLOAD_TYPE_EFFECT);
                    }
                }
            }
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markChanged(String str, String str2, String str3, String str4, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77be6537", new Object[]{this, str, str2, str3, str4, bool});
            return;
        }
        CustomChangeInfo customChangeInfo = new CustomChangeInfo(str, str2, str3, str4, bool);
        if (!customChangeInfo.isValid()) {
            Log.e("TinctOperator", "The custom change info is invalid!");
        } else if (!qrn.a().get()) {
            a((BaseChangeInfo) customChangeInfo);
        } else {
            a(customChangeInfo);
        }
    }

    private void a(final CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80152a8c", new Object[]{this, customChangeInfo});
        } else {
            qro.a().a(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$f$zGI7pdxdHz9Nrez3kv-Z6GzF5ns
                @Override // java.lang.Runnable
                public final void run() {
                    f.m1539lambda$zGI7pdxdHz9Nrez3kvZ6GzF5ns(CustomChangeInfo.this);
                }
            });
        }
    }

    public static /* synthetic */ void b(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398cb82b", new Object[]{customChangeInfo});
        } else if (!com.taobao.tinct.impl.config.a.b(customChangeInfo)) {
            Log.e("TinctOperator", "The custom change is disable: " + customChangeInfo.getHashKey());
        } else if (!b.a().a(customChangeInfo)) {
        } else {
            e.a(customChangeInfo, "change");
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public String getTinctInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a80ef40d", new Object[]{this, str});
        }
        if (!qrn.a().get() || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ChangeRecord d = b.a().d();
        if (d == null) {
            return "";
        }
        List<String> d2 = com.taobao.tinct.impl.config.a.d(str);
        boolean z = true;
        for (OrangeChangeInfo orangeChangeInfo : d.orangeChangeMap.values()) {
            if (orangeChangeInfo != null && orangeChangeInfo.getStatus() == 1 && ((d2 != null && d2.contains(orangeChangeInfo.getNameSpace())) || str.equals(orangeChangeInfo.getBizName()))) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(orangeChangeInfo.getTinctTag());
                z = false;
            }
        }
        for (ABChangeInfo aBChangeInfo : d.abInfoMap.values()) {
            if (str.equals(aBChangeInfo.getBizName())) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(aBChangeInfo.getTinctTag());
                z = false;
            }
        }
        ConcurrentHashMap<String, List<com.taobao.tinct.model.c>> concurrentHashMap = d.touchStoneInfo;
        if (concurrentHashMap.containsKey(str)) {
            for (com.taobao.tinct.model.c cVar : concurrentHashMap.get(str)) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(cVar.getTinctTag());
                z = false;
            }
        }
        for (CustomChangeInfo customChangeInfo : d.customInfo.values()) {
            if (str.equals(customChangeInfo.getBizName()) && !customChangeInfo.isExpire()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(customChangeInfo.getTinctTag());
                z = false;
            }
        }
        return sb.toString();
    }

    private void a(BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316ecbec", new Object[]{this, baseChangeInfo});
            return;
        }
        synchronized (this.f22954a) {
            this.f22954a.add(baseChangeInfo);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f22954a) {
            if (!this.f22954a.isEmpty()) {
                for (BaseChangeInfo baseChangeInfo : this.f22954a) {
                    String str = "Handle cache change of " + baseChangeInfo.getChangeType().name();
                    int i = AnonymousClass1.f22955a[baseChangeInfo.getChangeType().ordinal()];
                    if (i == 1) {
                        markOrangeUsed(baseChangeInfo.getBizName(), ((OrangeChangeInfo) baseChangeInfo).getNameSpace());
                    } else if (i == 2) {
                        ABChangeInfo aBChangeInfo = (ABChangeInfo) baseChangeInfo;
                        markABUsed(aBChangeInfo.getBizName(), aBChangeInfo.getExperimentId(), aBChangeInfo.getBucketId(), aBChangeInfo.getPublishId());
                    } else if (i == 3) {
                        a((CustomChangeInfo) baseChangeInfo);
                    }
                }
                this.f22954a.clear();
            }
        }
    }
}
