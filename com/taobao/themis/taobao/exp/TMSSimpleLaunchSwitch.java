package com.taobao.themis.taobao.exp;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.VariationSet;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/taobao/exp/TMSSimpleLaunchSwitch;", "", "()V", "AS_USUAL", "", "JUMP_TO_BROWSER", "JUMP_TO_TMS", "SWITCH_NAME", "", RPCDataItems.SWITCH_TAG_LOG, "urlPartList", "", "getJumpOption", "context", "Landroid/content/Context;", "url", "getJumpOptionInternal", "getTargetComponent", "launchOption", "LaunchOption", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSSimpleLaunchSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AS_USUAL = 3;
    public static final TMSSimpleLaunchSwitch INSTANCE;
    public static final long JUMP_TO_BROWSER = 1;
    public static final long JUMP_TO_TMS = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f22831a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/taobao/themis/taobao/exp/TMSSimpleLaunchSwitch$LaunchOption;", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes9.dex */
    public @interface LaunchOption {
    }

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        if (j == 1) {
            return "com.taobao.browser.BrowserActivity";
        }
        if (j != 2) {
            return null;
        }
        return "com.taobao.themis.container.app.TMSActivity";
    }

    static {
        kge.a(-1368788682);
        INSTANCE = new TMSSimpleLaunchSwitch();
        f22831a = p.b("ku.m.taobao.com/mix.htm", "pages.tmall.com/wow/hdwk/act/2020nhj-single", "pages-fast.m.taobao.com/wow/z/hdwk/tmfarm/babanongchang", "huodong.taobao.com/wow/z/vip/hbqd5/hbqd5.0", "pages-fast.m.taobao.com/wow/z/tmtjb/town/home", "pages.tmall.com/wow/z/app/ltao-fe/xsms-waitou-b/home", "pages-fast.m.taobao.com/wow/z/vip/hbqd5/hbqd5.0", "market.m.taobao.com/app/dinamic/h5-tb-logistics/router", "detail.m.tmall.com/item.htm", "web.m.taobao.com/app/mtb-guang/tab2-activity/share618", "web.m.taobao.com/app/mtb/refund-pha/detail", "pages.tmall.com/wow/bz/jingmi/1444", "pages.tmall.com/wow/z/wt/daily-earn-shee/8thjJK38HwhfMAskzDiN", "uland.taobao.com/coupon/edetail", "mos.m.taobao.com/union/cailiang_main", "uland.taobao.com/semm/tbsearch", "pages-fast.m.taobao.com/wow/bz/jingmi/1323", "market.m.taobao.com/app/zelda/xxl/index.html", "mo.m.taobao.com/union2/page_1690256876171");
    }

    private TMSSimpleLaunchSwitch() {
    }

    public final long a(Context context, String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361e", new Object[]{this, context, url})).longValue();
        }
        q.d(context, "context");
        q.d(url, "url");
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 3;
        try {
            Result.a aVar = Result.Companion;
            j = INSTANCE.b(context, url);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        TMSLogger.d("TMSSimpleLaunchSwitch", "getJumpOption cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + ", option is " + j);
        return j;
    }

    private final long b(Context context, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b80d7fd", new Object[]{this, context, str})).longValue();
        }
        String str2 = str;
        if (StringUtils.isEmpty(str2)) {
            return 3L;
        }
        List<String> list = f22831a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str3 : list) {
                if (n.b((CharSequence) str2, (CharSequence) str3, false, 2, (Object) null)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return 3L;
        }
        VariationSet activateSync = EVO.activateSync(context, "tms_anr_simple_launch_exp");
        if (activateSync.size() <= 0 || !activateSync.contains("tms_anr_simple_launch_exp")) {
            return 3L;
        }
        int valueAsInt = activateSync.getVariation("tms_anr_simple_launch_exp").getValueAsInt(0);
        if (valueAsInt == 1) {
            return 1L;
        }
        return valueAsInt != 2 ? 3L : 2L;
    }
}
