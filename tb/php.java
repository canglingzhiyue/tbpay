package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class php {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile php f32652a;
    private List<String> b = new ArrayList();

    static {
        kge.a(1442491842);
    }

    private php() {
        this.b.add("Page_TaobaoLiveWatch_Button-AccountFollow");
        this.b.add("Page_TaobaoLiveWatch_Button-CommentSend");
        this.b.add("Page_TaobaoLiveWatch_Button-Like");
        this.b.add("Page_TaobaoLiveWatch_Button-ShareLive");
        this.b.add("Page_TaobaoLiveWatch_Button-Goodslist");
        this.b.add("Page_TaobaoLiveWatch_Button-Click_Goodslist");
        this.b.add("Page_TaobaoLiveWatch_Button-detail");
        this.b.add("Page_TaobaoLiveWatch_Button-itemwindow");
        this.b.add("Page_TaobaoLiveWatch_Button-GoodsBuy");
        this.b.add("Page_TaobaoLiveWatch_Button-TaoLiveStayTime");
        this.b.add("Page_TaobaoLiveWatch_Button-TaoLiveEnter");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String a2 = aa.a(b());
        return !TextUtils.isEmpty(a2) && a2.contains(str);
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        List<String> list = this.b;
        return (list == null || list.isEmpty()) ? "" : this.b.toString();
    }

    public static php a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (php) ipChange.ipc$dispatch("f0922a6", new Object[0]);
        }
        if (f32652a == null) {
            synchronized (php.class) {
                if (f32652a == null) {
                    f32652a = new php();
                }
            }
        }
        return f32652a;
    }
}
