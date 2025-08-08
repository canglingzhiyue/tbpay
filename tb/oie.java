package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import tb.nzh;
import tb.nzi;

/* loaded from: classes8.dex */
public class oie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1705402154);
    }

    public static void a(nzi.a aVar, nzh.a aVar2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af46d575", new Object[]{aVar, aVar2});
        } else if (StringUtils.equals("false", nyl.b())) {
            oup.a();
        } else {
            try {
                TBShareContent j = e.b().j();
                if (j == null) {
                    return;
                }
                String[] split = OrangeConfig.getInstance().getConfig("android_share", "hideFriendBizIds", "").split(",");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (split[i].equals(j.businessId)) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    if (aVar == null) {
                        if (ShareBizAdapter.getInstance().getContactsInfoProvider() != null) {
                            ShareBizAdapter.getInstance().getContactsInfoProvider().a(aVar2);
                            return;
                        }
                    } else if (aVar2 == null && ShareBizAdapter.getInstance().getFriendsProvider() != null) {
                        ShareBizAdapter.getInstance().getFriendsProvider().a(1, aVar);
                        return;
                    }
                }
                oup.a();
            } catch (Exception e) {
                nyy.c("FriendsDataProvider", "onFriendsProvider setDataAndSendPoint err:" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
