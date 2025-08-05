package tb;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class kag extends kae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f29905a = jzv.a().getContentResolver();
    private final Uri b;

    static {
        kge.a(-677204961);
    }

    public static /* synthetic */ Object ipc$super(kag kagVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Uri a(kag kagVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("4e864e9e", new Object[]{kagVar}) : kagVar.b;
    }

    public static /* synthetic */ ContentResolver b(kag kagVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentResolver) ipChange.ipc$dispatch("babad4f0", new Object[]{kagVar}) : kagVar.f29905a;
    }

    public kag(Uri uri) {
        this.b = uri;
    }

    @Override // tb.kae
    public Reply b(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("634e04d1", new Object[]{this, call});
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("call", call);
        return a("call", bundle, call.isOneWay(), call.getMethodWrapper().isVoid());
    }

    @Override // tb.kah
    public void b(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("keys", (ArrayList) list);
        a(Constants.METHOD_RECYCLE_REMOTE, bundle, true, true);
    }

    private Reply a(final String str, final Bundle bundle, boolean z, boolean z2) throws IPCException {
        Bundle call;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("33a8ce41", new Object[]{this, str, bundle, new Boolean(z), new Boolean(z2)});
        }
        try {
            final ContentProviderClient acquireUnstableContentProviderClient = this.f29905a.acquireUnstableContentProviderClient(this.b);
            Object[] objArr = new Object[2];
            objArr[0] = "contentProviderClient==null ? ";
            objArr[1] = Boolean.valueOf(acquireUnstableContentProviderClient == null);
            kak.b("DefaultRemoteChannel", "[call]", objArr);
            if (z && z2) {
                b.a(false, false, new Runnable() { // from class: tb.kag.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (acquireUnstableContentProviderClient != null) {
                                acquireUnstableContentProviderClient.call(str, "", bundle);
                            } else {
                                kag.b(kag.this).call(kag.a(kag.this), str, "", bundle);
                            }
                        } catch (Exception e) {
                            kak.a("DefaultRemoteChannel", "[call]", e, new Object[0]);
                        }
                    }
                });
                return Reply.obtain().setResult(null);
            }
            if (acquireUnstableContentProviderClient != null) {
                call = acquireUnstableContentProviderClient.call(str, "", bundle);
            } else {
                call = this.f29905a.call(this.b, str, "", bundle);
            }
            if (z2) {
                return Reply.obtain().setResult(null);
            }
            call.setClassLoader(getClass().getClassLoader());
            Reply reply = (Reply) call.getParcelable(Constants.PARAM_REPLY);
            if (reply == null) {
                throw new IPCException(33, "reply data encode error from default channel!");
            }
            return reply;
        } catch (Throwable th) {
            kak.a("DefaultRemoteChannel", "[call err]", th, new Object[0]);
            if (th instanceof RemoteException) {
                throw new IPCException(1, th);
            }
            throw new IPCException(9, th);
        }
    }
}
