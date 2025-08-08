package tb;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeTopicList;
import com.taobao.message.subscribe.SubscribeUtils;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NetWorkUtils;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.List;

/* loaded from: classes7.dex */
public class lsb extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HREMINDSUBSCRIBE = -5307764651771652487L;

    static {
        kge.a(2101111539);
    }

    public static /* synthetic */ Object ipc$super(lsb lsbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(lsb lsbVar, SubScribeCenterResultDTO subScribeCenterResultDTO, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729f6670", new Object[]{lsbVar, subScribeCenterResultDTO, dllVar});
        } else {
            lsbVar.a(subScribeCenterResultDTO, dllVar);
        }
    }

    public static /* synthetic */ void a(lsb lsbVar, dll dllVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087204c", new Object[]{lsbVar, dllVar, th});
        } else {
            lsbVar.a(dllVar, th);
        }
    }

    public static /* synthetic */ void b(lsb lsbVar, SubScribeCenterResultDTO subScribeCenterResultDTO, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418704b1", new Object[]{lsbVar, subScribeCenterResultDTO, dllVar});
        } else {
            lsbVar.b(subScribeCenterResultDTO, dllVar);
        }
    }

    public static /* synthetic */ void c(lsb lsbVar, SubScribeCenterResultDTO subScribeCenterResultDTO, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106ea2f2", new Object[]{lsbVar, subScribeCenterResultDTO, dllVar});
        } else {
            lsbVar.c(subScribeCenterResultDTO, dllVar);
        }
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar != null && dllVar != null) {
            String c = dlhVar.c("subscribeType");
            if (StringUtils.isEmpty(c)) {
                ldf.d("HRemindSubscribeAbility", "subscribeType is empty");
                return null;
            }
            JSONObject a2 = dlhVar.a("subscribeParams");
            if (a2 == null) {
                ldf.d("HRemindSubscribeAbility", "subscribeParams is null");
                return null;
            } else if (!NetWorkUtils.isNetworkAvailable(Globals.getApplication())) {
                ldf.d("HRemindSubscribeAbility", "network is unavailable");
                TBToast.makeText(Globals.getApplication(), "网络错误").show();
                return null;
            } else {
                String string = a2.getString("topicId");
                String string2 = a2.getString("activityType");
                String string3 = a2.getString("subFrom");
                if (StringUtils.equals(c, WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE)) {
                    ldf.d("HRemindSubscribeAbility", "start query subscribe");
                    c(string, string2, string3, dllVar);
                } else if (StringUtils.equals(c, WVSubscribePlugin.ACTION_CANCEL_SUBSCRIBE)) {
                    ldf.d("HRemindSubscribeAbility", "start cancel subscribe");
                    b(string, string2, string3, dllVar);
                } else if (StringUtils.equals(c, WVSubscribePlugin.ACTION_DO_SUBSCRIBE)) {
                    ldf.d("HRemindSubscribeAbility", "start do subscribe");
                    a(string, string2, string3, dllVar);
                }
            }
        }
        return null;
    }

    private void a(String str, String str2, String str3, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed13552", new Object[]{this, str, str2, str3, dllVar});
        } else {
            SubscribeUtils.INSTANCE.doSubscribe(str, str2, null, str3, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.lsb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    lsb.a(lsb.this, subScribeCenterResultDTO, dllVar);
                    ldf.d("HRemindSubscribeAbility", "do subscribe status: " + subScribeCenterResultDTO.getRetCode());
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    ldf.a("HRemindSubscribeAbility", "do subscribe error", th);
                    lsb.a(lsb.this, dllVar, th);
                }
            });
        }
    }

    private void b(String str, String str2, String str3, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a92b113", new Object[]{this, str, str2, str3, dllVar});
        } else {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str2, null, str3, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.lsb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    ldf.d("HRemindSubscribeAbility", "cancel subscribe success");
                    lsb.a(lsb.this, subScribeCenterResultDTO, dllVar);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    ldf.a("HRemindSubscribeAbility", "cancel subscribe error", th);
                    lsb.a(lsb.this, dllVar, th);
                }
            });
        }
    }

    private void c(String str, String str2, String str3, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26542cd4", new Object[]{this, str, str2, str3, dllVar});
        } else {
            SubscribeUtils.INSTANCE.querySubscribe(str, str2, null, str3, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.lsb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        lsb.b(lsb.this, subScribeCenterResultDTO, dllVar);
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    ldf.a("HRemindSubscribeAbility", "query subscribe error", th);
                    lsb.a(lsb.this, dllVar, th);
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1597071670);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lsb a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lsb) ipChange.ipc$dispatch("16bdc367", new Object[]{this, obj}) : new lsb();
        }
    }

    private void a(final SubScribeCenterResultDTO subScribeCenterResultDTO, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13902db", new Object[]{this, subScribeCenterResultDTO, dllVar});
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.lsb.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!"SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                    } else {
                        dllVar.callback("success", new dla());
                    }
                }
            });
        } else if (!"SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
        } else {
            dllVar.callback("success", new dla());
        }
    }

    private void a(final dll dllVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3125501", new Object[]{this, dllVar, th});
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.lsb.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dllVar.callback("failed", new dla());
                    }
                }
            });
        } else {
            dllVar.callback("failed", new dla());
        }
    }

    private void b(final SubScribeCenterResultDTO subScribeCenterResultDTO, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49f721c", new Object[]{this, subScribeCenterResultDTO, dllVar});
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.lsb.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lsb.c(lsb.this, subScribeCenterResultDTO, dllVar);
                    }
                }
            });
        } else {
            c(subScribeCenterResultDTO, dllVar);
        }
    }

    private void c(SubScribeCenterResultDTO subScribeCenterResultDTO, dll dllVar) {
        SubScribeTopicList subScribeTopicList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2805e15d", new Object[]{this, subScribeCenterResultDTO, dllVar});
            return;
        }
        List<SubScribeTopicList> subScribeTopicList2 = subScribeCenterResultDTO.getSubScribeTopicList();
        if (subScribeTopicList2 == null || subScribeTopicList2.isEmpty() || (subScribeTopicList = subScribeTopicList2.get(0)) == null) {
            return;
        }
        String status = subScribeTopicList.getStatus();
        if (StringUtils.equals(status, "1")) {
            dllVar.callback("subscribed", new dla());
        } else {
            dllVar.callback("unsubscribe", new dla());
        }
        ldf.d("HRemindSubscribeAbility", "query subscribe status: " + status);
    }
}
