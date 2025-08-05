package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;
import com.taobao.android.remoteso.api.assets.a;
import com.taobao.android.remoteso.api.assets.b;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes6.dex */
public class nub extends nvd<a> implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final RSoLog.a f31765a = RSoLog.e("remo-assets-tracker");

    public nub(a aVar) {
        super(aVar);
    }

    @Override // com.taobao.android.remoteso.api.assets.a
    public CheckAssetsResult a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckAssetsResult) ipChange.ipc$dispatch("c33ab648", new Object[]{this, str});
        }
        try {
            RSoLog.a aVar = f31765a;
            aVar.a("checkAssets, enter = " + str);
            CheckAssetsResult a2 = a().a(str.startsWith("/") ? str.substring(1) : str);
            RSoLog.a aVar2 = f31765a;
            aVar2.a("checkAssets, result = " + a2);
            return a2;
        } catch (Throwable th) {
            ikq.a("checkAssetsSync error", th);
            CheckAssetsResult checkAssetsResult = new CheckAssetsResult(str, 2);
            RSoLog.a aVar3 = f31765a;
            aVar3.a("checkAssets, failed result = " + checkAssetsResult);
            return checkAssetsResult;
        }
    }

    @Override // com.taobao.android.remoteso.api.assets.a
    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aaa8258d", new Object[]{this, str});
        }
        try {
            RSoLog.a aVar = f31765a;
            aVar.a("openAssetsSync, enter = " + str);
            b b = a().b(str.startsWith("/") ? str.substring(1) : str);
            RSoLog.a aVar2 = f31765a;
            aVar2.a("openAssetsSync, result = " + b);
            return b;
        } catch (Throwable th) {
            ikq.a("openAssetsSync error", th);
            b bVar = new b(str, null, RSoException.error((int) JosStatusCodes.RNT_CODE_NO_JOS_INFO, th));
            RSoLog.a aVar3 = f31765a;
            aVar3.a("openAssetsSync, failed result = " + bVar);
            return bVar;
        }
    }
}
