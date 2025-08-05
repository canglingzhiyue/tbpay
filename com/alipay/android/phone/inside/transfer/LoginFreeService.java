package com.alipay.android.phone.inside.transfer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.alipay.android.phone.inside.transfer.IFetchLoginInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.download.DownloadCenter;
import com.taobao.wireless.link.login.a;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes3.dex */
public class LoginFreeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;

    /* loaded from: classes3.dex */
    class Mybind extends IFetchLoginInfo.Stub implements IBinder {
        Mybind() {
        }

        @Override // com.alipay.android.phone.inside.transfer.IFetchLoginInfo
        public String getTokenLoginInfo() {
            rkg.a("link_tag", "LoginFreeService === getTokenLoginInfo === 获取到的免登信息：" + a.a().f23600a);
            String h = rkj.h(LoginFreeService.access$000(LoginFreeService.this));
            if (!TextUtils.isEmpty(h)) {
                a.a().b.put(h, true);
            }
            rkg.a("link_tag", "LoginFreeService === getTokenLoginInfo === 写入免登信息包名集合：" + a.a().b);
            rki.a(rki.ARG1_READ_LOGIN_FREE, "", a.a().f23600a, null);
            DownloadCenter.a().a(LoginFreeService.access$000(LoginFreeService.this), h);
            return a.a().f23600a;
        }
    }

    public static /* synthetic */ Object ipc$super(LoginFreeService loginFreeService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1992651935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    public static /* synthetic */ Context access$000(LoginFreeService loginFreeService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ef3ae99", new Object[]{loginFreeService}) : loginFreeService.mContext;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.mContext = this;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue() : super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : new Mybind();
    }
}
