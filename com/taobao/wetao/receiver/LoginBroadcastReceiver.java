package com.taobao.wetao.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LoginBroadcastReceiver f23564a = new LoginBroadcastReceiver();
    private List<a> b = new ArrayList();

    /* renamed from: com.taobao.wetao.receiver.LoginBroadcastReceiver$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23565a = new int[LoginAction.values().length];

        static {
            try {
                f23565a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23565a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23565a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23565a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes9.dex */
    public static class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }
    }

    public static LoginBroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginBroadcastReceiver) ipChange.ipc$dispatch("a8255f64", new Object[0]) : f23564a;
    }

    private LoginBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && !StringUtils.isEmpty(intent.getAction())) {
            int i = AnonymousClass1.f23565a[LoginAction.valueOf(intent.getAction()).ordinal()];
            if (i == 1) {
                for (a aVar : this.b) {
                    aVar.a();
                }
            } else if (i == 2) {
                Iterator<a> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } else if (i == 3) {
                Iterator<a> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            } else if (i == 4) {
                for (a aVar2 : this.b) {
                    aVar2.b();
                }
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41619001", new Object[]{this, aVar});
        } else {
            this.b.add(aVar);
        }
    }
}
