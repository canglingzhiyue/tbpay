package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.jarviswe.Jarvis;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1907228917);
        emu.a("com.taobao.android.detail.wrapper.utils.UserBehaviorTrackUtil");
    }

    public static void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{detailCoreActivity});
        } else if (!fgz.c) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("nid", detailCoreActivity.f9411a.f27180a);
                Jarvis.getTracker(detailCoreActivity).onPageCreate("Detail", hashMap);
            } catch (Throwable th) {
                i.a("UserBehaviorTrackUtil", i.b.MEASURE_ONCREATE, th);
            }
        }
    }

    public static void b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6c7d2", new Object[]{detailCoreActivity});
        } else if (!fgz.c) {
        } else {
            try {
                Jarvis.getTracker(detailCoreActivity).onPageAppear();
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("UserBehaviorTrackUtil", "onResume", th);
            }
        }
    }

    public static void c(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39317cb1", new Object[]{detailCoreActivity});
        } else if (!fgz.c) {
        } else {
            try {
                Jarvis.getTracker(detailCoreActivity).onPageDisappear();
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("UserBehaviorTrackUtil", "onPause", th);
            }
        }
    }

    public static void d(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7c3190", new Object[]{detailCoreActivity});
        } else if (!fgz.c) {
        } else {
            try {
                Jarvis.getTracker(detailCoreActivity).onPageDestroy();
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("UserBehaviorTrackUtil", MessageID.onDestroy, th);
            }
        }
    }

    public static void e(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc6e66f", new Object[]{detailCoreActivity});
        } else if (!fgz.c) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                c cVar = detailCoreActivity.y().t;
                hashMap.put("nid", cVar.i());
                hashMap.put("seller_id", cVar.h());
                hashMap.put("shop_type", cVar.p() == 2 ? "B" : "C");
                hashMap.put("category_id", ((ItemNode) cVar.f10055a.b("item", ItemNode.class)).categoryId);
                Jarvis.getTracker(detailCoreActivity).updatePageArgs(hashMap);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("UserBehaviorTrackUtil", "updatePageArgs", th);
            }
        }
    }

    public static void a(Context context, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b038ade4", new Object[]{context, textView});
        } else if (!fgz.c) {
        } else {
            try {
                String str = (String) textView.getText();
                if (StringUtils.equals(str, "宝贝")) {
                    str = "naviTabInfo";
                } else if (StringUtils.equals(str, "评价")) {
                    str = "naviTabRate";
                } else if (StringUtils.equals(str, "详情")) {
                    str = "naviTabDesc";
                } else if (StringUtils.equals(str, "推荐")) {
                    str = "naviTabDescRecmd";
                }
                Jarvis.getTracker(context).onAreaAppear(str, null);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("UserBehaviorTrackUtil", "onAreaAppear", th);
            }
        }
    }
}
