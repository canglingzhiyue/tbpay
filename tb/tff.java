package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.behavix.utils.e;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.mytaobao.base.c;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0%2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/about/WidgetAboutSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/alibaba/fastjson/JSONObject;", "()V", "CLICK_INTERVAL_TIME_IN_MILLIS", "", "CLICK_THRESHOLD_VALUE", "", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "clickedCount", "mPrevClickTimeInMillis", "resultJson", "buildUt", "utName", "", "spm", "defaultShowBuildNumberInfo", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "getAppPolicyNavUrl", "getCopyRightNavUrl", "getString", "resId", "initData", "showBuildNumberInfo", "isShow", "subscribe", "updateOriginalData", "updateAction", "Lcom/taobao/message/lab/comfrm/core/Action;", "originalData", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tff implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ActionDispatcher f34076a;
    private final JSONObject b = new JSONObject();
    private final int c = 5;
    private final long d = 500;
    private int e;
    private long f;

    static {
        kge.a(-2037837884);
        kge.a(-915263556);
    }

    public JSONObject a(Action updateAction, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("138d2d0b", new Object[]{this, updateAction, jSONObject});
        }
        q.c(updateAction, "updateAction");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public /* synthetic */ JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3c4474", new Object[]{this, action, jSONObject}) : a(action, jSONObject);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        q.c(actionDispatcher, "actionDispatcher");
        this.f34076a = actionDispatcher;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f34076a = null;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> props, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, props, actionDispatcher});
            return;
        }
        q.c(command, "command");
        q.c(props, "props");
        String name = command.getName();
        if (name == null) {
            return;
        }
        int hashCode = name.hashCode();
        if (hashCode == 254455115) {
            if (!name.equals(StdActions.COMMAND_INIT_SOURCE)) {
                return;
            }
            a();
        } else if (hashCode != 907028016 || !name.equals("clickVersion") || b() || this.e < 0) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f;
            if (j > 0 && currentTimeMillis - j > this.d) {
                this.e = 0;
            }
            this.e++;
            this.f = currentTimeMillis;
            if (this.e < this.c) {
                return;
            }
            this.e = -1;
            a(true, this.b);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "info", (String) this.b);
            if (actionDispatcher == null) {
                return;
            }
            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.put((JSONObject) "title", b.a(R.string.mt_aboutMTTitle));
        this.b.put((JSONObject) "version", a(R.string.mytaobao_version) + " " + Globals.getVersionName());
        a(b(), this.b);
        this.b.put((JSONObject) "hasVersionUpdate", c.v() ? "false" : "true");
        if (!c.v()) {
            e.a().post(a.INSTANCE);
        }
        this.b.put((JSONObject) "goCommentTxt", b.a(R.string.mt_aboutMTToEvaluate));
        this.b.put((JSONObject) "applicationLink", "market://details?id=com.taobao.taobao");
        this.b.put((JSONObject) "goCommentUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_去评价", "a2141.20998086.4.2"));
        this.b.put((JSONObject) "versionUpdateTxt", b.a(R.string.mt_aboutMTVersionUpdate));
        this.b.put((JSONObject) "versionUpdateUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_版本更新", "a2141.20998086.4.3"));
        this.b.put((JSONObject) "copyRightTxt", b.a(R.string.mt_aboutMTCopyrightInfo));
        this.b.put((JSONObject) "copyRightNavUrl", c());
        this.b.put((JSONObject) "copyRightUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_版权信息", "a2141.20998086.4.4"));
        this.b.put((JSONObject) "appPolicyTxt", b.a(R.string.mt_aboutMTSoftwareLicense));
        this.b.put((JSONObject) "appPolicyNavUrl", d());
        this.b.put((JSONObject) "appPolicyUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_软件许可使用协议", "a2141.20998086.4.6"));
        this.b.put((JSONObject) "fillCodeTxt", mxj.a("fillCodeTxt", b.a(R.string.mt_aboutMTCasenumber)));
        this.b.put((JSONObject) "fillCodeNavUrl", mxj.a("fillCodeUrl", "https://beian.miit.gov.cn"));
        this.b.put((JSONObject) "lastText", "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "info", (String) this.b);
        ActionDispatcher actionDispatcher = this.f34076a;
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ovv.getInstance(Globals.getApplication()).update(true);
            }
        }
    }

    private final String c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String a2 = mxj.a("CopyrightInformation_" + b.a().getTag(), "");
        String str = a2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        return z ? b.a() == Language.SIMPLIFIED_CHINESE ? "http://h5.m.taobao.com/other/android_legal.html" : "https://h5.m.taobao.com/other/ios_legal.html?ut_sk=1.ZQ13pploqAcDAHqcg58cySy1_21380790_1716197474350.Copy.windvane&suid=B13A2B9E-ACFC-4ECD-B226-2E5ECB39ACF5&sourceType=other&ttid=201200%40taobao_iphone_10.35.30&un=37ea548c8b25c9fe686897b71d2d2124&share_crt_v=1&un_site=0&spm=a2159r.13376460.0.0&sp_tk=YXpxWVdGeWU2OU8%3D&cpp=1&shareurl=true&short_name=h.g2xtOjz&bxsign=scdAKCk-iFrvXsOIW82pVUdKhAwZVmPbhPLCpKyFjU2VcBEYYf7y0CbXjdcXbepvL1x1Yo6Azo9bnkKKIbVMQDhcqFI_09BoyT9neWWRHLtlbvNTlyaQsx4qL_VsWWRqpx2&app=chrome" : a2;
    }

    private final String d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String a2 = mxj.a("SoftwareLicense_" + b.a().getTag(), "");
        String str = a2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        return z ? b.a() == Language.SIMPLIFIED_CHINESE ? "http://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao201901082305_94250.html" : "https://terms.alicdn.com/legal-agreement/terms/c_end_product_protocol/20240707181310588/20240707181310588.html" : a2;
    }

    private final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else if (z) {
            jSONObject.put((JSONObject) "builderId", "Build id: " + Globals.getApplication().getString(R.string.packageTag));
        } else {
            jSONObject.put((JSONObject) "builderId", "");
        }
    }

    private final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Versions.isDebug();
    }

    private final JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "spm", str2);
        return com.taobao.mytaobao.newsetting.dx.c.Companion.a("Page_MYTBSettingVC_aboutTB", str, jSONObject);
    }

    private final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        String string = Globals.getApplication().getString(i);
        q.a((Object) string, "Globals.getApplication().getString(resId)");
        return string;
    }
}
