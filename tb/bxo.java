package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.phenix.intf.b;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes7.dex */
public class bxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(567657610);
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, View view) {
        boolean z;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbaff288", new Object[]{baseSectionModel, baseSubItemModel, bundle, view})).booleanValue();
        }
        if (!baseSectionModel.containsKey("ext") || bundle == null) {
            ldf.d("LiveRoomTransitionUtil", "无法检查实验标识，因为 section 不包含 ext 或 extras = " + bundle);
            return false;
        }
        JSONObject jSONObject2 = baseSectionModel.getJSONObject("ext");
        if (jSONObject2 == null || !jSONObject2.containsKey("stark_enableLiveTransition") || !"true".equals(jSONObject2.getString("stark_enableLiveTransition"))) {
            z = false;
        } else {
            ldf.d("LiveRoomTransitionUtil", "命中了直播间新交互，服务端放量标记。");
            z = true;
        }
        if (!z || !baseSubItemModel.containsKey("content") || (jSONObject = baseSubItemModel.getJSONObject("content")) == null || !jSONObject.containsKey("imageUrl") || TextUtils.isEmpty(jSONObject.getString("imageUrl"))) {
            ldf.d("LiveRoomTransitionUtil", "一二跳交互优化，直播间新交互，未命中。return false ");
            return false;
        }
        String string = jSONObject.getString("imageUrl");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            string = ImageStrategyDecider.decideUrl(string, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), null);
        }
        int a2 = ldj.a("orange_key_value_live_blur_radius", 60);
        bundle.putString("coverImage", string);
        bundle.putString(aw.PARAM_COVER_GAUSS_RADIUS, String.valueOf(a2));
        bundle.putString(aw.PARAM_COVER_GAUSS_SAMPLING, String.valueOf(2));
        b.h().a(string).bitmapProcessors(new com.taobao.phenix.compat.effects.b(view.getContext(), a2, 2)).fetch();
        ldf.d("LiveRoomTransitionUtil", "首页数据已带入直播间。封面主图预加载中。 12202149, decidedUrl = " + string);
        return true;
    }
}
