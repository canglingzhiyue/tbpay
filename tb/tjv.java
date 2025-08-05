package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes8.dex */
public class tjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final tnm f34162a;
    private final tnc b;
    private final tnk c;
    private final xky d;

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final tjv f34163a;

        static {
            kge.a(1194149139);
            f34163a = new tjv(new tmd(), new tjw(), new tjx(), new xkx());
        }

        public static /* synthetic */ tjv a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tjv) ipChange.ipc$dispatch("f0afc5e", new Object[0]) : f34163a;
        }
    }

    static {
        kge.a(1954683709);
    }

    private tjv(tnm tnmVar, tnc tncVar, tnk tnkVar, xky xkyVar) {
        this.f34162a = tnmVar;
        this.b = tncVar;
        this.c = tnkVar;
        this.d = xkyVar;
    }

    public static tjv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tjv) ipChange.ipc$dispatch("f0afc5e", new Object[0]) : a.a();
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("livesource");
        String queryParameter3 = parse.getQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL);
        String queryParameter4 = parse.getQueryParameter("liveUrlList");
        if ("detailLive".equals(queryParameter2)) {
            this.d.a(context, str);
        } else if ("detailReplay".equals(queryParameter2)) {
        } else {
            if (queryParameter4 != null || queryParameter3 != null) {
                String str2 = "秒开参数预创建：" + queryParameter;
                this.c.a(context, str);
            } else if (queryParameter != null) {
                String str3 = "CDN 预创建 " + queryParameter;
                this.b.a(context, str);
            } else if (queryParameter2 == null) {
            } else {
                String str4 = "推荐接口mtop.tblive.live.recommend.home 预创建" + queryParameter2;
                this.f34162a.a(context, str, queryParameter2);
            }
        }
    }
}
