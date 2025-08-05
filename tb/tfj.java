package tb;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment;
import com.taobao.mytaobao.newsetting.dx.e;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J0\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBSelectTimePickerEventHandler;", "Lcom/taobao/mytaobao/newsetting/dx/MTBSettingSwitchEventHandler;", "()V", "afterSaved", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "handle", "refreshPage", "showMutePicker", "activity", "Landroid/app/Activity;", "itemKey", "", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfj extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EVENT_HANDLER_CLICK_PICKER = "eventhandler.mtb.widget.setting.click.picker";
    public static final String EVENT_HANDLER_SWITCH_PICKER = "eventhandler.mtb.widget.setting.switch.picker";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ CommandHandler c;
        public final /* synthetic */ String d;

        public b(ServiceProvider serviceProvider, CommandHandler commandHandler, String str) {
            this.b = serviceProvider;
            this.c = commandHandler;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageService pageService;
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ServiceProvider serviceProvider = this.b;
            if (serviceProvider == null || (pageService = (PageService) serviceProvider.service(PageService.class)) == null || (activity = pageService.getActivity()) == null) {
                return;
            }
            tfj.a(tfj.this, this.c, activity, this.d);
        }
    }

    static {
        kge.a(-2033391235);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(tfj tfjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1224233213) {
            super.handle((Action) objArr[0], (ActionDispatcher) objArr[1], (CommandHandler) objArr[2], (ServiceProvider) objArr[3]);
            return null;
        } else if (hashCode != 797186986) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Action) objArr[0], (ActionDispatcher) objArr[1], (CommandHandler) objArr[2], (ServiceProvider) objArr[3]);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "success", "", "errorMsg", "", "ext", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "onResult"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c<T> implements mtr<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ CommandHandler c;

        public c(String str, CommandHandler commandHandler) {
            this.b = str;
            this.c = commandHandler;
        }

        @Override // tb.mtr
        public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
            } else {
                a(z, str, jSONObject);
            }
        }

        public final void a(boolean z, String str, JSONObject jSONObject) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            com.taobao.global.setting.c a2 = com.taobao.global.setting.c.a(Globals.getApplication(), "mytaobao");
            q.a((Object) a2, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
            kta c = a2.c();
            String str3 = this.b + "Sub";
            if (jSONObject == null || (str2 = jSONObject.toJSONString()) == null) {
                str2 = "";
            }
            c.a("mytaobao", str3, str2, null);
            tfj.a(tfj.this, this.c);
        }
    }

    public static final /* synthetic */ void a(tfj tfjVar, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1a8181", new Object[]{tfjVar, commandHandler});
        } else {
            tfjVar.a(commandHandler);
        }
    }

    public static final /* synthetic */ void a(tfj tfjVar, CommandHandler commandHandler, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56945d1d", new Object[]{tfjVar, commandHandler, activity, str});
        } else {
            tfjVar.a(commandHandler, activity, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBSelectTimePickerEventHandler$Companion;", "", "()V", "EVENT_HANDLER_CLICK_PICKER", "", "EVENT_HANDLER_SWITCH_PICKER", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-809968507);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.mytaobao.newsetting.dx.e, com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        if (q.a((Object) (action != null ? action.getName() : null), (Object) EVENT_HANDLER_SWITCH_PICKER)) {
            super.handle(action, actionDispatcher, commandHandler, serviceProvider);
            return;
        }
        if (!q.a((Object) (action != null ? action.getName() : null), (Object) EVENT_HANDLER_CLICK_PICKER) || mxx.a()) {
            return;
        }
        Object data = action.getData();
        if (!(data instanceof JSONObject)) {
            data = null;
        }
        JSONObject jSONObject2 = (JSONObject) data;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("settingItem")) == null || (string = jSONObject.getString("key")) == null) {
            return;
        }
        com.taobao.android.behavix.utils.e.a().post(new b(serviceProvider, commandHandler, string));
    }

    @Override // com.taobao.mytaobao.newsetting.dx.e
    public void a(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f841baa", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        q.c(action, "action");
        super.a(action, actionDispatcher, commandHandler, serviceProvider);
        a(commandHandler);
    }

    private final void a(CommandHandler commandHandler, Activity activity, String str) {
        FragmentManager supportFragmentManager;
        int i;
        int i2;
        int i3;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bae955", new Object[]{this, commandHandler, activity, str});
            return;
        }
        if (!(activity instanceof FragmentActivity)) {
            activity = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        try {
            com.taobao.global.setting.c a2 = com.taobao.global.setting.c.a(Globals.getApplication(), "mytaobao");
            q.a((Object) a2, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
            parseObject = JSONObject.parseObject((String) a2.b().a("mytaobao", str + "Sub", "", null));
            i = parseObject.getIntValue("startHour");
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            i2 = parseObject.getIntValue("starMinute");
        } catch (Throwable unused2) {
            i2 = 0;
            i3 = 0;
            MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
        }
        try {
            i3 = parseObject.getIntValue("endHour");
            try {
                i4 = parseObject.getIntValue("endMinute");
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            i3 = 0;
            MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
        }
        MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new c(str, commandHandler)).show(supportFragmentManager, "picker");
    }

    private final void a(CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572ba5b9", new Object[]{this, commandHandler});
            return;
        }
        Command build = new Command.Build("settingStatusSource", "updateStatus").build();
        if (commandHandler == null) {
            return;
        }
        commandHandler.handle(build);
    }
}
