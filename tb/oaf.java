package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.busniess.model.b;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* loaded from: classes8.dex */
public class oaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oaa f31865a = new oaa() { // from class: tb.oaf.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.oaa
        public void a(obd obdVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbe996ce", new Object[]{this, obdVar, bVar});
            } else if (oaf.a(oaf.this) == null) {
            } else {
                oaf.a(oaf.this, obdVar);
                oaf.a(oaf.this, bVar);
                if (bVar == null) {
                    oaf.a(oaf.this).a("", "NO RESULT");
                } else if (TextUtils.isEmpty(bVar.b) || !oaf.a(oaf.this).a(oaf.b(oaf.this), obdVar, bVar)) {
                } else {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: tb.oaf.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                oaf.this.a();
                            }
                        }
                    }, 300L);
                }
            }
        }
    };
    private Context b;
    private String c;
    private TaoPasswordShareType d;
    private Map<String, String> e;
    private TBShareContent f;
    private com.taobao.share.taopassword.genpassword.model.a g;
    private a h;
    private obd i;
    private b j;
    private oak k;

    /* renamed from: tb.oaf$3  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31869a = new int[TaoPasswordShareType.values().length];

        static {
            try {
                f31869a[TaoPasswordShareType.ShareTypeQQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31869a[TaoPasswordShareType.ShareTypeWeixin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2);

        boolean a(TaoPasswordShareType taoPasswordShareType, obd obdVar, b bVar);
    }

    static {
        kge.a(1046492293);
    }

    public static /* synthetic */ b a(oaf oafVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd27dad6", new Object[]{oafVar, bVar});
        }
        oafVar.j = bVar;
        return bVar;
    }

    public static /* synthetic */ a a(oaf oafVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fd1a0851", new Object[]{oafVar}) : oafVar.h;
    }

    public static /* synthetic */ obd a(oaf oafVar, obd obdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obd) ipChange.ipc$dispatch("e9ee58f2", new Object[]{oafVar, obdVar});
        }
        oafVar.i = obdVar;
        return obdVar;
    }

    public static /* synthetic */ TaoPasswordShareType b(oaf oafVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoPasswordShareType) ipChange.ipc$dispatch("7be0dcdb", new Object[]{oafVar}) : oafVar.d;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2997c8a7", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    public void a(oak oakVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f787675f", new Object[]{this, oakVar});
        } else {
            this.k = oakVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.j == null) {
        } else {
            if (("true".equals(OrangeConfig.getInstance().getConfig("android_share", "shareWeChatFriendFlag", "false")) || TextUtils.equals(this.j.g, "true")) && this.d == TaoPasswordShareType.ShareTypeWeixin) {
                this.i.a(this.b, this.j.e, this.k);
                obb.a(this.b, this.j.e);
                this.k.a(true);
                return;
            }
            this.i.a(this.b, c(), this.j.e, this.k);
        }
    }

    private TPTargetType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TPTargetType) ipChange.ipc$dispatch("e102c0df", new Object[]{this});
        }
        int i = AnonymousClass3.f31869a[this.d.ordinal()];
        if (i == 1) {
            return TPTargetType.QQFRIEND;
        }
        if (i == 2) {
            return TPTargetType.WEIXIN;
        }
        return TPTargetType.OTHER;
    }

    public oaf(Context context, String str, TBShareContent tBShareContent, Map<String, String> map) {
        this.b = context;
        this.c = str;
        this.e = map;
        this.f = tBShareContent;
    }

    public void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f == null) {
            a aVar = this.h;
            if (aVar == null) {
                return;
            }
            aVar.a("", "context is null");
        } else {
            TaoPasswordShareType taoPasswordShareType = null;
            if (ShareTargetType.Share2QQ.getValue().equals(this.c)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeQQ;
                str = "TaoPassword-QQ";
            } else if (ShareTargetType.Share2Weixin.getValue().equals(this.c)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeWeixin;
                str = "TaoPassword-WeiXin";
            } else if (ShareTargetType.Share2Copy.getValue().equals(this.c)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeCopy;
                str = "Copy";
            } else if (ShareTargetType.Share2SMS.getValue().equals(this.c)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeSMS;
                str = "taopassword-sms";
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.h.a("", "target is null");
            } else {
                a(this.f, taoPasswordShareType, str);
            }
        }
    }

    private void a(TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3603bcb", new Object[]{this, tBShareContent, taoPasswordShareType, str});
            return;
        }
        String str2 = tBShareContent.description;
        f g = e.b().g();
        if (g != null && !TextUtils.isEmpty(g.f19632a)) {
            str2 = g.f19632a + " " + str2;
        }
        com.taobao.share.taopassword.genpassword.model.a aVar = new com.taobao.share.taopassword.genpassword.model.a();
        aVar.f19662a = tBShareContent.businessId;
        aVar.c = str2;
        aVar.d = ShareServiceApi.urlBackFlow(tBShareContent.businessId, str, tBShareContent.url);
        aVar.e = tBShareContent.imageUrl;
        aVar.f = tBShareContent.shareScene;
        aVar.j = tBShareContent.extraParams;
        aVar.b = tBShareContent.title;
        aVar.o = tBShareContent.shareScene;
        if ("shop".equals(tBShareContent.templateId)) {
            aVar.o = TemplateId.SHOP.toString();
        } else if ("detail".equals(tBShareContent.templateId)) {
            aVar.o = TemplateId.ITEM.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            aVar.m = str.toLowerCase();
        } else {
            aVar.m = "other";
        }
        aVar.k = tBShareContent.popType.name;
        aVar.l = tBShareContent.popUrl;
        if (tBShareContent.disableBackToClient) {
            aVar.n = 0;
        }
        a(ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext(), taoPasswordShareType, aVar);
    }

    private void a(Context context, TaoPasswordShareType taoPasswordShareType, com.taobao.share.taopassword.genpassword.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea49473", new Object[]{this, context, taoPasswordShareType, aVar});
        } else if (context == null || aVar == null) {
            this.h.a("", "context or content is null");
        } else if (TextUtils.isEmpty(aVar.c) || TextUtils.isEmpty(aVar.d)) {
            this.h.a("", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18116));
        } else {
            if (TextUtils.isEmpty(aVar.f)) {
                aVar.f = "other";
            }
            this.b = context;
            this.d = taoPasswordShareType;
            if (taoPasswordShareType == null) {
                this.d = TaoPasswordShareType.ShareTypeOther;
            }
            this.g = aVar;
            oai.a(true);
            a(aVar);
        }
    }

    private void a(com.taobao.share.taopassword.genpassword.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7580095", new Object[]{this, aVar});
            return;
        }
        ALCreatePassWordModel aLCreatePassWordModel = new ALCreatePassWordModel();
        aLCreatePassWordModel.c = aVar.f19662a;
        aLCreatePassWordModel.b = aVar.c;
        aLCreatePassWordModel.f19654a = aVar.d;
        if (aVar.f != null) {
            if (TextUtils.equals(aVar.f, "item")) {
                aLCreatePassWordModel.a("item");
            } else if (TextUtils.equals(aVar.f, "shop")) {
                aLCreatePassWordModel.a("shop");
            } else {
                aLCreatePassWordModel.a("other");
            }
        }
        if (aVar.m != null) {
            if (TextUtils.equals(aVar.m, "copy")) {
                aLCreatePassWordModel.a("copy");
            } else if (TextUtils.equals(aVar.m, ALCreatePassWordModel.QQ)) {
                aLCreatePassWordModel.a(ALCreatePassWordModel.QQ);
            } else if (TextUtils.equals(aVar.m, ALCreatePassWordModel.WeiXin)) {
                aLCreatePassWordModel.a(ALCreatePassWordModel.WeiXin);
            } else {
                aLCreatePassWordModel.a("other");
            }
        }
        aLCreatePassWordModel.i = aVar.m;
        aLCreatePassWordModel.d = aVar.e;
        aLCreatePassWordModel.e = aVar.o;
        aLCreatePassWordModel.f = aVar.j;
        aLCreatePassWordModel.g = aVar.k;
        aLCreatePassWordModel.h = aVar.l;
        com.taobao.share.taopassword.a.a().a(ShareBizAdapter.getInstance().getAppEnv().b(), aLCreatePassWordModel, new nzu() { // from class: tb.oaf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzu
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else {
                    oaf.this.f31865a.a(new obd(), (b) obj);
                }
            }

            @Override // tb.nzu
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    oaf.a(oaf.this).a(str, str2);
                }
            }
        });
    }
}
