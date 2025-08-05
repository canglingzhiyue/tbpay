package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes6.dex */
public class nhl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-689490585);
    }

    public static void a(JSONObject jSONObject, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d29cda", new Object[]{jSONObject, activity});
            return;
        }
        ((LinearLayout) activity.findViewById(R.id.purchase_skeleton_loading)).setVisibility(0);
        ((LinearLayout) activity.findViewById(R.id.purchase_skeleton)).setVisibility(8);
        a(activity, jSONObject.getJSONObject("header"));
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray == null || jSONArray.size() != 1) {
            return;
        }
        b(activity, jSONArray.getJSONObject(0));
        c(activity, jSONArray.getJSONObject(0));
    }

    private static void a(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d13476", new Object[]{activity, jSONObject});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) activity.findViewById(R.id.iv_address_icon);
        TextView textView = (TextView) activity.findViewById(R.id.tv_address);
        TextView textView2 = (TextView) activity.findViewById(R.id.tv_address_name);
        TextView textView3 = (TextView) activity.findViewById(R.id.tv_address_phone);
        tUrlImageView.enableSizeInLayoutParams(true);
        new PhenixOptions().fuzzyMatchCache(true);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("fullName");
        if (!TextUtils.isEmpty(string)) {
            textView2.setText(string);
        }
        String string2 = jSONObject2.getString("mobile");
        if (!TextUtils.isEmpty(string2)) {
            textView3.setText(string2);
        }
        String string3 = jSONObject2.getString("addressText");
        if (TextUtils.isEmpty(string3)) {
            return;
        }
        textView.setText(string3);
    }

    private static void b(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d4ffd5", new Object[]{activity, jSONObject});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) activity.findViewById(R.id.iv_shop_icon);
        TextView textView = (TextView) activity.findViewById(R.id.tv_shop_name);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("shopIcon");
        if (!TextUtils.isEmpty(string)) {
            tUrlImageView.enableSizeInLayoutParams(true);
            new PhenixOptions().fuzzyMatchCache(true);
            tUrlImageView.setImageUrl(string);
        }
        String string2 = jSONObject2.getString("shopName");
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        textView.setText(string2);
    }

    private static void c(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd8cb34", new Object[]{activity, jSONObject});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) activity.findViewById(R.id.iv_order_item_icon);
        TextView textView = (TextView) activity.findViewById(R.id.tv_order_item_title);
        TextView textView2 = (TextView) activity.findViewById(R.id.tv_order_item_sku);
        TextView textView3 = (TextView) activity.findViewById(R.id.tv_order_item_quantity);
        activity.findViewById(R.id.ll_label);
        TextView textView4 = (TextView) activity.findViewById(R.id.tv_label_one);
        TextView textView5 = (TextView) activity.findViewById(R.id.tv_label_two);
        TextView textView6 = (TextView) activity.findViewById(R.id.tv_label_three);
        TextView textView7 = (TextView) activity.findViewById(R.id.tv_service);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("pic");
        if (!TextUtils.isEmpty(string)) {
            tUrlImageView.enableSizeInLayoutParams(true);
            PhenixOptions phenixOptions = new PhenixOptions();
            phenixOptions.fuzzyMatchCache(true);
            tUrlImageView.setImageUrl(string, phenixOptions);
        }
        String string2 = jSONObject2.getString("title");
        if (!TextUtils.isEmpty(string2)) {
            textView.setText(string2);
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("sku");
        if (jSONObject3 != null) {
            String string3 = jSONObject3.getString("title");
            if (!TextUtils.isEmpty(string3)) {
                textView2.setText(string3);
            }
        }
        String string4 = jSONObject2.getString("quantity");
        if (!TextUtils.isEmpty(string4)) {
            textView3.setText(string4);
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("label");
        if (jSONArray != null) {
            int size = jSONArray.size();
            if (size == 1) {
                textView4.setText(jSONArray.get(0).toString());
                textView4.setVisibility(0);
            } else if (size == 2) {
                textView4.setText(jSONArray.get(0).toString());
                textView4.setVisibility(0);
                textView5.setText(jSONArray.get(1).toString());
                textView5.setVisibility(0);
            } else if (size == 3) {
                textView4.setText(jSONArray.get(0).toString());
                textView4.setVisibility(0);
                textView5.setText(jSONArray.get(1).toString());
                textView5.setVisibility(0);
                textView6.setText(jSONArray.get(2).toString());
                textView6.setVisibility(0);
            }
        }
        textView7.setText(b.a(R.string.purchase_taobao_app_1029_1_19075));
    }
}
