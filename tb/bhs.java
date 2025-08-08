package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.a;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.android.split.t;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import java.io.File;

/* loaded from: classes.dex */
public class bhs implements bhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bgu f25915a = (bgu) a.b(bgu.class, "DefaultFeatureSourceStrategy");
    private xin b = (xin) a.a((Class<? extends Object>) xin.class, new Object[0]);

    @Override // tb.bhv
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            if (b.a().c(str) != null && !v.c(k.a().b().t(), str)) {
                String a2 = k.a().b().j().a();
                bgu bguVar = this.f25915a;
                bguVar.d("CurrentUseHisAppVersion:" + a2, new Object[0]);
                if (!StringUtils.isEmpty(a2)) {
                    if (b.a().c(str).matchedAppFeatureMd5.containsKey(a2)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // tb.bhv
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            return k.a().b().j().a();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [tb.bgy] */
    @Override // tb.bhv
    public boolean a(Context context, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            bgu bguVar = this.f25915a;
            bguVar.d("FeatureSourceStrategy  installHistoryFeature:" + str, new Object[0]);
            z = new bgy(context, true, str2, false);
            File c = z.c(str);
            try {
                if (c.exists() && this.b.a(c.getAbsolutePath()).equals(b.a().c(str).matchedAppFeatureMd5.get(str2))) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!k.a().a(context, true, (bgy) z, str) || p.a() == null || !p.a().a().contains(str)) {
                        return false;
                    }
                    t.a().b(str, "history");
                    ((j) a.a((Class<? extends Object>) j.class, new Object[0])).a(str, true, "install_history_" + z.b(), System.currentTimeMillis() - currentTimeMillis, 0, "", z.c(str).getPath().split("splitcompat")[1], z.c(str).length(), bic.a(), bhx.c(), bhx.a(), bhx.b());
                    bgu bguVar2 = this.f25915a;
                    bguVar2.d("FeatureSourceStrategy  installHistoryFeature:" + str + " success", new Object[0]);
                    return true;
                }
                bgu bguVar3 = this.f25915a;
                Object[] objArr = new Object[2];
                objArr[0] = c.getAbsolutePath();
                objArr[1] = c.exists() ? bib.a(c) : "";
                bguVar3.d("hisSplitApkFile exist:%s and md5 is:%s", objArr);
                bgu bguVar4 = this.f25915a;
                bguVar4.d("FeatureSourceStrategy  installHistoryFeature:" + str + " md5 is mismatch", new Object[0]);
                return false;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = 0;
        }
    }
}
