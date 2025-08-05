package tb;

import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import com.taobao.android.resourceguardian.data.model.a;
import com.taobao.android.resourceguardian.data.model.b;

/* loaded from: classes6.dex */
public class ili {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilg f29137a = new ilg();

    static {
        kge.a(-79809677);
    }

    private long a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd34deb3", new Object[]{this, new Integer(i), str, new Long(j)})).longValue() : ils.a(RGTypeInfo.a(i), str, j);
    }

    private b a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("196c1881", new Object[]{this, aVar, new Boolean(z)});
        }
        String str = aVar.c.get("battery_level");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (Integer.parseInt(str) <= a(401, "critical", 20L)) {
                return new b.a().a(4).b(401).b(str).a("critical").a();
            }
            if (!z) {
                return null;
            }
            return new b.a().a(4).b(401).b(str).a("normal").a();
        } catch (NumberFormatException e) {
            ilt.a("PerformanceWarningController", e.toString());
            return null;
        }
    }

    private b c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed58b74b", new Object[]{this, aVar}) : a(aVar, false);
    }

    private b b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1cf3bb82", new Object[]{this, aVar, new Boolean(z)});
        }
        String str = aVar.c.get("battery_temperature");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (Integer.parseInt(str) >= a(402, "critical", 42L)) {
                return new b.a().a(4).b(402).b(str).a("critical").a();
            }
            if (!z) {
                return null;
            }
            return new b.a().a(4).b(402).b(str).a("normal").a();
        } catch (NumberFormatException e) {
            ilt.a("PerformanceWarningController", e.toString());
            return null;
        }
    }

    private b d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("16c0302a", new Object[]{this, aVar}) : b(aVar, false);
    }

    private b c(a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("207b5e83", new Object[]{this, aVar, new Boolean(z)});
        }
        String str2 = aVar.c.get("javaUsedRate");
        if (!TextUtils.isEmpty(str2)) {
            try {
                long parseInt = Integer.parseInt(str2);
                if (parseInt > a(201, "critical", 95L)) {
                    str = "critical";
                } else {
                    str = parseInt > a(201, BaseFBPlugin.PWD_TIPS_TYPE.typeWarning, 90L) ? BaseFBPlugin.PWD_TIPS_TYPE.typeWarning : z ? "normal" : null;
                }
                if (str != null) {
                    return new b.a().a(2).b(201).b(str2).a(str).a();
                }
                return null;
            } catch (NumberFormatException e) {
                ilt.a("PerformanceWarningController", e.toString());
            }
        }
        return null;
    }

    private b e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4027a909", new Object[]{this, aVar}) : c(aVar, false);
    }

    private b d(a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("24030184", new Object[]{this, aVar, new Boolean(z)});
        }
        String str2 = aVar.c.get("nativeHeapAllocatedSize");
        if (!TextUtils.isEmpty(str2)) {
            try {
                long parseInt = Integer.parseInt(str2);
                if (parseInt >= a(202, "critical", 1073741824L)) {
                    str = "critical";
                } else {
                    str = parseInt >= a(202, BaseFBPlugin.PWD_TIPS_TYPE.typeWarning, 1073741824L) ? BaseFBPlugin.PWD_TIPS_TYPE.typeWarning : z ? "normal" : null;
                }
                if (str != null) {
                    return new b.a().a(2).b(202).b(str2).a(str).a();
                }
                return null;
            } catch (NumberFormatException e) {
                ilt.a("PerformanceWarningController", e.toString());
            }
        }
        return null;
    }

    private b f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("698f21e8", new Object[]{this, aVar}) : d(aVar, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public b a(a aVar) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9a89c58d", new Object[]{this, aVar});
        }
        switch (aVar.b) {
            case 2:
                bVar = c(aVar);
                break;
            case 3:
                bVar = e(aVar);
                break;
            case 4:
            case 7:
                bVar = null;
                break;
            case 5:
                bVar = d(aVar);
                break;
            case 6:
                bVar = this.f29137a.a(aVar);
                break;
            case 8:
            default:
                ilt.a("PerformanceWarningController", RGCategoryInfo.a(aVar.f14877a), ilo.a(aVar.b), aVar.toString());
                bVar = null;
                break;
            case 9:
                bVar = f(aVar);
                break;
        }
        if (bVar != null && ilv.a(RGCategoryInfo.a(bVar.f14879a), RGTypeInfo.a(bVar.b))) {
            return null;
        }
        if (!ils.a(bVar)) {
            return bVar;
        }
        ilt.a("PerformanceWarningController", "checkFatigue true", bVar.toString());
        return null;
    }

    public b b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c3f13e6c", new Object[]{this, aVar});
        }
        switch (aVar.b) {
            case 2:
                return a(aVar, true);
            case 3:
                return c(aVar, true);
            case 4:
            case 7:
                return null;
            case 5:
                return b(aVar, true);
            case 6:
                return this.f29137a.a(aVar, true);
            case 8:
            default:
                ilt.a("PerformanceWarningController", RGCategoryInfo.a(aVar.f14877a), ilo.a(aVar.b), aVar.toString());
                return null;
            case 9:
                return d(aVar, true);
        }
    }
}
