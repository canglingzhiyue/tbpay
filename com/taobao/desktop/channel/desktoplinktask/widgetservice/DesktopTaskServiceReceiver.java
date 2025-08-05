package com.taobao.desktop.channel.desktoplinktask.widgetservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import tb.kge;
import tb.kgz;
import tb.khm;
import tb.khn;
import tb.oro;
import tb.orr;
import tb.ors;
import tb.ppi;

/* loaded from: classes7.dex */
public class DesktopTaskServiceReceiver extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-467185657);
    }

    public static /* synthetic */ Object ipc$super(DesktopTaskServiceReceiver desktopTaskServiceReceiver, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1256323805) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        }
    }

    public static /* synthetic */ void a(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1706c20", new Object[]{messenger, new Integer(i), bundle});
        } else {
            b(messenger, i, bundle);
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-538803244);
        }

        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                int i = message.what;
                ors orsVar = new ors();
                if (i == 1 || i == 2) {
                    f fVar = new f(i);
                    Bundle data = message.getData();
                    if (data == null) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, e.FUNNEL_STEP_LAUNCH_WIDGET, "bundleEmpty", "");
                        return;
                    }
                    String string = data.getString("config");
                    if (TextUtils.isEmpty(string)) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, e.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
                        return;
                    }
                    khn.a(khm.a().b()).a(data.getString("uid", ""));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("config", (Object) string);
                    jSONObject.put("abBucketId", (Object) data.getString("abBucketId", ""));
                    jSONObject.put(DnsNavConfigTask.MatchKey, (Object) data.getString(DnsNavConfigTask.MatchKey, ""));
                    jSONObject.put("localRecord", (Object) data.getString("record", ""));
                    fVar.d = jSONObject;
                    fVar.e = message.replyTo;
                    if (i == 1) {
                        new orr().a(fVar);
                    } else {
                        new oro().a(fVar);
                    }
                } else if (i != 3) {
                } else {
                    Bundle data2 = message.getData();
                    if (data2 == null) {
                        e.a(i, "", null, e.FUNNEL_STEP_LAUNCH_WIDGET, "bundleEmpty", "");
                        return;
                    }
                    final String string2 = data2.getString("triggerEventId", "");
                    final String string3 = data2.getString("bizCode", "");
                    String string4 = data2.getString("action", "");
                    boolean z = data2.getBoolean("needToast", true);
                    if (JarvisConstant.KEY_JARVIS_TRIGGER.equals(string4)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("needToast", (Object) Boolean.valueOf(z));
                        orsVar.a(string2, string3, jSONObject2, message.replyTo, new ppi() { // from class: com.taobao.desktop.channel.desktoplinktask.widgetservice.DesktopTaskServiceReceiver.a.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.ppi
                            public void a(f fVar2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c09d17ee", new Object[]{this, fVar2});
                                    return;
                                }
                                kgz.b("DesktopTaskServiceReceiver.triggerActiveTask.onSuccess.triggerEventId=%s.bizCode=%s.", string2, string3);
                                Bundle bundle = new Bundle();
                                bundle.putString("bizCode", string3);
                                DesktopTaskServiceReceiver.a(fVar2.e, 1, bundle);
                            }

                            @Override // tb.ppi
                            public void a(f fVar2, String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("b9516238", new Object[]{this, fVar2, str});
                                    return;
                                }
                                kgz.b("DesktopTaskServiceReceiver.triggerActiveTask.onFail.triggerEventId=%s.bizCode=%s.errorMessage=%s", string2, string3, str);
                                Bundle bundle = new Bundle();
                                bundle.putString("bizCode", string3);
                                DesktopTaskServiceReceiver.a(fVar2.e, 2, bundle);
                            }

                            @Override // tb.ppi
                            public void b(f fVar2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d152e4af", new Object[]{this, fVar2});
                                    return;
                                }
                                kgz.b("DesktopTaskServiceReceiver.triggerActiveTask.onClose.triggerEventId=%s.bizCode=%s", string2, string3);
                                Bundle bundle = new Bundle();
                                bundle.putString("bizCode", string3);
                                DesktopTaskServiceReceiver.a(fVar2.e, 3, bundle);
                            }
                        });
                    } else if ("close".equals(string4)) {
                        orsVar.b(string3);
                    } else if (!"query".equals(string4)) {
                    } else {
                        int a2 = orsVar.a(string3);
                        Bundle bundle = new Bundle();
                        bundle.putString("bizCode", string3);
                        bundle.putInt("status", a2);
                        DesktopTaskServiceReceiver.a(message.replyTo, 4, bundle);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void b(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ea9261", new Object[]{messenger, new Integer(i), bundle});
            return;
        }
        try {
            if (messenger == null) {
                kgz.a("DesktopTaskServiceReceiver.sendReplyMessage.replyMsg=null", new Object[0]);
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i;
            if (bundle != null) {
                obtain.setData(bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        kgz.a("DesktopTaskReceiver onBind", new Object[0]);
        return new Messenger(new a()).getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        kgz.a("DesktopTaskReceiver onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        kgz.a("DesktopTaskReceiver onDestroy", new Object[0]);
        super.onDestroy();
    }
}
