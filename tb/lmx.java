package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class lmx implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f30728a;
    private a b;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "AlimamaQZTManager";
    }

    static {
        kge.a(1947038203);
        kge.a(191318335);
        f30728a = lmx.class.getSimpleName();
    }

    public lmx(a aVar) {
        this.b = aVar;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ddw.a().a(this);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ddw.a().b(this);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.good_click".equals(str) && (obj instanceof String[])) {
            a((String[]) obj);
        } else if (!"com.taobao.taolive.room.enter".equals(str)) {
        } else {
            b();
        }
    }

    private void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        VideoInfo u = poy.u(this.b);
        if (u == null || u.alimamaEnjoyFirst == null || u.alimamaEnjoyFirst.eurl == null) {
            return;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String a2 = a(u.alimamaEnjoyFirst.eurl);
        String replaceAll = u.alimamaEnjoyFirst.eurl.replaceAll("__INTERACT_TYPE__", tfu.GOTO_DETAIL).replaceAll(gvw.ITEM_ID_PLACE_HOLDER, str2).replaceAll("__TIMESTAMP__", String.valueOf(System.currentTimeMillis() / 1000));
        String replaceAll2 = replaceAll.replaceAll("__APPINFO__", d() + "_0");
        if (cgl.c() != null) {
            cgl.c().a(replaceAll2, c());
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
        hashMap.put("itemId", str2);
        hashMap.put("alimamaLiveId", a2);
        hashMap.put("isSame", StringUtils.equals(str, a2) ? "true" : "false");
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", "alimamaTcpReportCheck", hashMap);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(this.b);
        if (u == null || u.alimamaEnjoyFirst == null || u.alimamaEnjoyFirst.ifs == null) {
            return;
        }
        String str = u.alimamaEnjoyFirst.ifs;
        String replaceAll = str.replaceAll("__APPINFO__", d() + "_0");
        if (cgl.c() == null) {
            return;
        }
        cgl.c().a(replaceAll, c(), "TargetQzt");
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Matcher matcher = Pattern.compile("feedid=(\\d+)").matcher(Uri.decode(str));
        return matcher.find() ? matcher.group(1) : "";
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String K = poy.K(this.b);
        String ac = poy.ac(this.b);
        return "appKey=" + d() + "#livesource=" + ac + "#spm=" + K;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : pmd.a().u() != null ? pmd.a().u().b() : "21646297";
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.enter", "com.taobao.taolive.room.good_click"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        a aVar = this.b;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }
}
