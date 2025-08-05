package tb;

import android.os.Build;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes7.dex */
public class stn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(619046917);
    }

    public static String a(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bc5cf0", new Object[]{baseSectionModel});
        }
        if (baseSectionModel != null && (ext = baseSectionModel.getExt()) != null) {
            return ext.getString("cardFeatureId");
        }
        return null;
    }

    public static String b(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ad380f", new Object[]{baseSectionModel});
        }
        if (baseSectionModel != null && (args = baseSectionModel.getArgs()) != null) {
            return args.getString(aw.PARAM_PVID);
        }
        return null;
    }

    public static int c(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ab07ba5", new Object[]{baseSectionModel})).intValue();
        }
        if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null || !args.containsKey("recIndex")) {
            return -1;
        }
        try {
            return args.getIntValue("recIndex");
        } catch (InfoFlowRuntimeException e) {
            ldf.a("RecyclerViewExposeUtils", "getRecIndex error", e);
            return -1;
        }
    }

    public static void a(BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93484d22", new Object[]{baseSectionModel, view});
        } else if (!ldj.a("enableCollectionHandGesture", true) || view == null) {
        } else {
            JSONObject args = baseSectionModel.getArgs();
            if (Build.VERSION.SDK_INT >= 19 && lcz.a() != null && (l.b(lcz.a()) || l.d(lcz.a()))) {
                z = true;
            }
            if (args == null || z) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return;
            }
            args.put("cardPosition", (Object) (((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == 0 ? "left" : "right"));
            args.put("slideGestureHands", (Object) dsi.a());
        }
    }
}
