package com.taobao.search.searchdoor.sf.config;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static String f19360a;
    private static TbSearchStyle b;
    private static final Handler c;

    /* renamed from: com.taobao.search.searchdoor.sf.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0782a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19361a;

        public RunnableC0782a(String str) {
            this.f19361a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.INSTANCE, this.f19361a);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19362a;

        public b(String str) {
            this.f19362a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final TbSearchStyleVO tbSearchStyleVO = (TbSearchStyleVO) JSON.parseObject(this.f19362a, TbSearchStyleVO.class);
            a.a(a.INSTANCE).post(new Runnable() { // from class: com.taobao.search.searchdoor.sf.config.a.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.INSTANCE, TbSearchStyleVO.this.tbSearchStyles);
                    TbSearchStyle b = a.b(a.INSTANCE);
                    if (b == null) {
                        q.a();
                    }
                    b.isTb2024 = true;
                }
            });
        }
    }

    static {
        kge.a(-138656700);
        a aVar = new a();
        INSTANCE = aVar;
        c = new Handler(Looper.getMainLooper());
        OrangeConfig.getInstance().registerListener(new String[]{"search_biz_css"}, AnonymousClass1.INSTANCE, true);
        String tb2024Config = OrangeConfig.getInstance().getConfig("search_biz_css", "tb2024CssConfig", "{\"tbSearchStyles\":{\"common\":{\"mainBgColor\":\"#FFFFFF\",\"subBgColor\":\"#F3F6F8\",\"mainTextColor\":\"#11192D\",\"subTextColor\":\"#50607A\",\"subTextColorAuxiliary\":\"#7C889C\",\"maskColor\":\"rgba(14,17,25,0.5)\",\"lineColor\":\"#E5E8EC\",\"weakTipColor\":\"#CACFD7\",\"taobaoColor\":\"#FF6200\",\"taobaoYellowColor\":\"#FFB300\",\"taobaoPaleRedColor\":\"#FFEFE5\",\"tmallColor\":\"#FF0036\",\"tmallPaleRedColor\":\"#FFE5EA\",\"moduleRounded\":\"6px\"},\"commonDark\":{\"mainBgColor\":\"#222222\",\"subBgColor\":\"#1C222E\",\"mainTextColor\":\"#F3F6F8\",\"subTextColor\":\"#CACFD7\",\"subTextColorAuxiliary\":\"#7C889C\",\"maskColor\":\"rgba(14,17,25,0.5)\",\"lineColor\":\"#1C222E\",\"weakTipColor\":\"#444C5A\",\"taobaoColor\":\"#FF6200\",\"taobaoYellowColor\":\"#FFB300\",\"taobaoPaleRedColor\":\"#311D11\",\"tmallColor\":\"#FF0036\",\"tmallPaleRedColor\":\"#2F111C\",\"moduleRounded\":\"6px\"},\"card\":{\"wfImgRounded\":\"6px\",\"listImgRounded\":\"6px\",\"titleTextSize\":\"13px\",\"titleBold\":\"true\"}}}");
        f19360a = tb2024Config;
        q.a((Object) tb2024Config, "tb2024Config");
        aVar.a(tb2024Config);
    }

    private a() {
    }

    public static final /* synthetic */ Handler a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("81770f9a", new Object[]{aVar}) : c;
    }

    public static final /* synthetic */ void a(a aVar, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb786116", new Object[]{aVar, tbSearchStyle});
        } else {
            b = tbSearchStyle;
        }
    }

    public static final /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e885e76", new Object[]{aVar, str});
        } else {
            f19360a = str;
        }
    }

    public static final /* synthetic */ TbSearchStyle b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbSearchStyle) ipChange.ipc$dispatch("3f60fbf3", new Object[]{aVar}) : b;
    }

    public static final /* synthetic */ void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc47d677", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    /* renamed from: com.taobao.search.searchdoor.sf.config.a$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // com.taobao.orange.d
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            String str2 = map.get("tb2024CssConfig");
            if (str2 == null) {
                return;
            }
            a.b(a.INSTANCE, str2);
        }
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        c.post(new RunnableC0782a(str));
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            Coordinator.execute(new b(str));
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : f19360a;
    }

    public final TbSearchStyle b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbSearchStyle) ipChange.ipc$dispatch("c721ab77", new Object[]{this}) : b;
    }
}
