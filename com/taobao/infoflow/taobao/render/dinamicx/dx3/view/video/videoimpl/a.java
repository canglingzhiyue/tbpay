package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.io.File;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.ldf;
import tb.lxr;

/* loaded from: classes7.dex */
public class a extends AsyncTask<String, Void, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f17428a = "DownloadVideoTask";
    private WeakReference<e> b;
    private final String c;

    static {
        kge.a(742662052);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Boolean doInBackground(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, bool});
        } else {
            a(bool);
        }
    }

    public a(e eVar, String str) {
        this.b = new WeakReference<>(eVar);
        this.c = str;
    }

    public Boolean a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("af9a174", new Object[]{this, strArr});
        }
        Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(this.c), null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            try {
                String a2 = i.a(this.c);
                if (StringUtils.isEmpty(a2)) {
                    return false;
                }
                boolean a3 = lxr.a(a2, syncSend.getBytedata());
                ldf.d("DownloadVideoTask", "DownloadVideoTask downLoadVideo saveResult:" + a3 + " filePath:" + a2 + " success; url:" + this.c);
                if (!a3) {
                    File file = new File(a2);
                    if (file.exists()) {
                        ldf.d("DownloadVideoTask", "DownloadVideoTask", "ErrorDownloadFile");
                        TBS.Ext.commitEvent("Page_Home", 19999, "ErrorDownloadFile", "");
                        file.delete();
                    }
                }
                return Boolean.valueOf(a3);
            } catch (Throwable th) {
                ldf.a("DownloadVideoTask", "DownloadVideoTask", th);
            }
        }
        return false;
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            return;
        }
        super.onPostExecute(bool);
        ldf.d("DownloadVideoTask", "DownloadVideoTask onPostExecute ret:" + bool + "  url:" + this.c);
        e eVar = this.b.get();
        if (eVar == null) {
            ldf.d("DownloadVideoTask", "onPostExecute videoDownLoadListener is null");
        } else if (bool != null && bool.booleanValue()) {
            eVar.a(this.c);
        } else {
            eVar.a();
        }
    }
}
