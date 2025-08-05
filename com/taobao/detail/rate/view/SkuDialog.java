package com.taobao.detail.rate.view;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.detail.rate.widget.RateSkuTagLayout;
import com.taobao.detail.rate.widget.a;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gbk;
import tb.kil;

/* loaded from: classes7.dex */
public class SkuDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View closeView;
    private View containerView;
    private JSONArray data;
    private String defaultItemUrl;
    private c iSkuInitListener;
    private d iSkuSelectListener;
    private JSONObject itemInfo;
    private TUrlImageView itemPicView;
    private TextView itemTitleView;
    private int mAnimStyle;
    private HashMap<Integer, String> pidNameMap;
    private TextView skuConfirmView;
    private JSONObject skuInfo;
    private LinearLayout skuItemContainerView;
    private TextView skuResetView;
    private List<RateSkuTagLayout> skuSelectViewList;
    private StringBuilder skuSelectedBuilder;
    private TextView skuSelectedView;
    private StringBuilder skuUnSelectBuilder;
    private TextView skuUnselectView;
    private float mAlpha = 1.0f;
    private float mWidth = 1.0f;
    private boolean isDimEnabled = true;
    private Map<Integer, String> selectedSKUPids = new HashMap();
    private AtomicBoolean isOpened = new AtomicBoolean(false);

    public static /* synthetic */ Object ipc$super(SkuDialog skuDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -185779930) {
            super.onCancel((DialogInterface) objArr[0]);
            return null;
        } else if (hashCode != 2089880052) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDismiss((DialogInterface) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ TUrlImageView access$000(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("e79d1d51", new Object[]{skuDialog}) : skuDialog.itemPicView;
    }

    public static /* synthetic */ void access$100(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c639e6a", new Object[]{skuDialog});
        } else {
            skuDialog.resetView();
        }
    }

    public static /* synthetic */ d access$200(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("18fad97c", new Object[]{skuDialog}) : skuDialog.iSkuSelectListener;
    }

    public static /* synthetic */ JSONArray access$300(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("34bf2b96", new Object[]{skuDialog}) : skuDialog.data;
    }

    public static /* synthetic */ Map access$400(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4b4e913c", new Object[]{skuDialog}) : skuDialog.selectedSKUPids;
    }

    public static /* synthetic */ void access$500(SkuDialog skuDialog, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cdd130", new Object[]{skuDialog, str});
        } else {
            skuDialog.setItemPicView(str);
        }
    }

    public static /* synthetic */ String access$600(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5efb4cbb", new Object[]{skuDialog}) : skuDialog.defaultItemUrl;
    }

    public static /* synthetic */ void access$700(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6530f024", new Object[]{skuDialog});
        } else {
            skuDialog.updateSkuDisplayView();
        }
    }

    public static /* synthetic */ c access$800(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a585e997", new Object[]{skuDialog}) : skuDialog.iSkuInitListener;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.Theme_RateSKUDialog);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.containerView = layoutInflater.inflate(R.layout.rate_sku_fragment, (ViewGroup) null);
        View findViewById = this.containerView.findViewById(R.id.skv_container);
        a aVar = new a(-1, 50, 50, 0, 0);
        if (Build.VERSION.SDK_INT >= 16) {
            findViewById.setBackground(aVar);
        } else {
            findViewById.setBackgroundDrawable(aVar);
        }
        if (this.pidNameMap == null) {
            this.pidNameMap = new HashMap<>();
        }
        if (this.selectedSKUPids == null) {
            this.selectedSKUPids = new HashMap();
        }
        this.closeView = this.containerView.findViewById(R.id.sku_dialog_close);
        this.closeView.setContentDescription(com.taobao.android.litecreator.localization.a.a(R.string.rate_accessibility_close_button));
        this.closeView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.view.SkuDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    SkuDialog.this.dismiss();
                }
            }
        });
        this.containerView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.view.SkuDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    SkuDialog.this.dismiss();
                }
            }
        });
        this.itemPicView = (TUrlImageView) this.containerView.findViewById(R.id.sku_item_pic);
        this.itemTitleView = (TextView) this.containerView.findViewById(R.id.sku_item_title);
        JSONObject jSONObject = this.itemInfo;
        if (jSONObject != null) {
            this.defaultItemUrl = jSONObject.getString("image");
            if (!TextUtils.isEmpty(this.defaultItemUrl)) {
                this.itemPicView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.detail.rate.view.SkuDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        BitmapDrawable drawable;
                        int a2;
                        Bitmap a3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent != null && (drawable = succPhenixEvent.getDrawable()) != null && SkuDialog.access$000(SkuDialog.this) != null && (a3 = kil.a(drawable.getBitmap(), SkuDialog.access$000(SkuDialog.this).getWidth(), SkuDialog.access$000(SkuDialog.this).getHeight(), a2, a2, a2, (a2 = kil.a(12.0f)))) != null) {
                            SkuDialog.access$000(SkuDialog.this).setImageBitmap(a3);
                        }
                        return false;
                    }
                });
                this.itemPicView.setImageUrl(this.defaultItemUrl);
            }
            if (!TextUtils.isEmpty(this.itemInfo.getString("title"))) {
                this.itemTitleView.setText(this.itemInfo.getString("title"));
            }
        }
        this.skuSelectedView = (TextView) this.containerView.findViewById(R.id.sku_selected_sku);
        this.skuUnselectView = (TextView) this.containerView.findViewById(R.id.sku_select_sku_tip);
        this.skuUnselectView.setVisibility(8);
        this.skuResetView = (TextView) this.containerView.findViewById(R.id.rate_sku_reset);
        this.skuResetView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.view.SkuDialog.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                SkuDialog.access$100(SkuDialog.this);
                if (SkuDialog.access$200(SkuDialog.this) == null) {
                    return;
                }
                SkuDialog.access$200(SkuDialog.this).a(-1, null, true, 0, DMComponent.RESET);
            }
        });
        this.skuConfirmView = (TextView) this.containerView.findViewById(R.id.rate_sku_confirm);
        this.skuConfirmView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.view.SkuDialog.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (SkuDialog.access$200(SkuDialog.this) != null) {
                    SkuDialog.access$200(SkuDialog.this).a(-1, null, true, 0, "confirm");
                }
                SkuDialog.this.dismiss();
            }
        });
        this.skuItemContainerView = (LinearLayout) this.containerView.findViewById(R.id.rate_sku_item_container_layout);
        this.skuSelectViewList = new ArrayList();
        JSONArray jSONArray = this.data;
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = this.data.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = this.data.getJSONObject(i);
                final RateSkuTagLayout rateSkuTagLayout = new RateSkuTagLayout(getActivity(), jSONObject2);
                rateSkuTagLayout.setPostion(i);
                this.pidNameMap.put(Integer.valueOf(i), jSONObject2.getString("name"));
                this.skuSelectViewList.add(rateSkuTagLayout);
                this.skuItemContainerView.addView(rateSkuTagLayout.getView());
                rateSkuTagLayout.setTagSelectListener(new e() { // from class: com.taobao.detail.rate.view.SkuDialog.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.detail.rate.view.e
                    public void a(String str, boolean z, int i2, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        int i3 = 0;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4a89bfd", new Object[]{this, str, new Boolean(z), new Integer(i2), obj});
                            return;
                        }
                        while (true) {
                            if (i3 >= SkuDialog.access$300(SkuDialog.this).size()) {
                                break;
                            }
                            JSONObject jSONObject3 = SkuDialog.access$300(SkuDialog.this).getJSONObject(i3);
                            if (jSONObject3 == null || !jSONObject3.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID).equals(str)) {
                                i3++;
                            } else if (z) {
                                SkuDialog.access$400(SkuDialog.this).put(Integer.valueOf(i3), jSONObject3.getString("name"));
                            } else {
                                SkuDialog.access$400(SkuDialog.this).remove(Integer.valueOf(i3));
                            }
                        }
                        if (obj instanceof JSONObject) {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            if (jSONObject4.getString("image") instanceof String) {
                                String string = jSONObject4.getString("image");
                                if (!z) {
                                    SkuDialog skuDialog = SkuDialog.this;
                                    SkuDialog.access$500(skuDialog, SkuDialog.access$600(skuDialog));
                                } else if (!TextUtils.isEmpty(string)) {
                                    SkuDialog.access$500(SkuDialog.this, string);
                                }
                            }
                        }
                        SkuDialog.access$700(SkuDialog.this);
                        if (SkuDialog.access$200(SkuDialog.this) == null) {
                            return;
                        }
                        SkuDialog.access$200(SkuDialog.this).a(rateSkuTagLayout.getPostion(), str, z, i2, obj);
                    }
                });
                if (i < size - 1) {
                    View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.rate_sku_divider, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
                    layoutParams.setMargins(kil.a(12.0f), kil.a(15.0f), kil.a(12.0f), 0);
                    this.skuItemContainerView.addView(inflate, layoutParams);
                }
            }
        }
        this.mAnimStyle = R.style.RateSkuDialogWindowAnim;
        this.containerView.setAlpha(this.mAlpha);
        updateSkuDisplayView();
        c cVar = this.iSkuInitListener;
        if (cVar != null) {
            cVar.a();
        }
        return this.containerView;
    }

    private void setItemPicView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071ba0b", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.itemPicView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(str);
    }

    private void updateSkuDisplayView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caab15a", new Object[]{this});
            return;
        }
        this.skuSelectedBuilder = new StringBuilder();
        if (this.pidNameMap.size() == this.selectedSKUPids.size()) {
            for (int i = 0; i < this.pidNameMap.size(); i++) {
                StringBuilder sb = this.skuSelectedBuilder;
                sb.append("\"");
                sb.append(this.pidNameMap.get(Integer.valueOf(i)));
                sb.append("\"  ");
            }
            this.skuUnselectView.setVisibility(8);
            if (this.selectedSKUPids.size() == 0) {
                this.skuSelectedView.setVisibility(8);
            } else {
                this.skuSelectedView.setVisibility(0);
            }
            TextView textView = this.skuSelectedView;
            textView.setText(com.taobao.android.litecreator.localization.a.a(R.string.rate_select_1) + ((Object) this.skuSelectedBuilder));
            return;
        }
        this.skuUnSelectBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.pidNameMap.size(); i2++) {
            if (this.selectedSKUPids.containsKey(Integer.valueOf(i2))) {
                StringBuilder sb2 = this.skuSelectedBuilder;
                sb2.append("\"");
                sb2.append(this.pidNameMap.get(Integer.valueOf(i2)));
                sb2.append("\"  ");
            } else {
                StringBuilder sb3 = this.skuUnSelectBuilder;
                sb3.append(this.pidNameMap.get(Integer.valueOf(i2)));
                sb3.append("  ");
            }
        }
        if (this.selectedSKUPids.size() == 0) {
            this.skuSelectedView.setVisibility(8);
        } else {
            this.skuSelectedView.setVisibility(0);
        }
        TextView textView2 = this.skuSelectedView;
        textView2.setText(com.taobao.android.litecreator.localization.a.a(R.string.rate_select_1) + ((Object) this.skuSelectedBuilder));
        this.skuUnselectView.setVisibility(0);
        TextView textView3 = this.skuUnselectView;
        textView3.setText(com.taobao.android.litecreator.localization.a.a(R.string.rate_please_select_1) + ((Object) this.skuUnSelectBuilder));
    }

    public void resetSelectTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aea6176", new Object[]{this});
            return;
        }
        Map<Integer, String> map = this.selectedSKUPids;
        if (map == null) {
            return;
        }
        map.clear();
    }

    private void resetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        this.selectedSKUPids.clear();
        if (this.data != null) {
            for (int i = 0; i < this.data.size(); i++) {
                JSONObject jSONObject = this.data.getJSONObject(i);
                if (jSONObject != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("values");
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        jSONArray.getJSONObject(i2).put(gbk.TYPE_SELECTED, (Object) false);
                    }
                    this.skuSelectViewList.get(i).setData(jSONObject);
                    this.skuSelectViewList.get(i).reset();
                }
            }
        }
        updateSkuDisplayView();
        View view = this.containerView;
        if (view == null) {
            return;
        }
        view.postDelayed(new Runnable() { // from class: com.taobao.detail.rate.view.SkuDialog.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (SkuDialog.access$800(SkuDialog.this) == null) {
                } else {
                    SkuDialog.access$800(SkuDialog.this).a();
                }
            }
        }, 100L);
    }

    public void setCanSelect(int i, boolean z, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd5b713", new Object[]{this, new Integer(i), new Boolean(z), list});
            return;
        }
        List<RateSkuTagLayout> list2 = this.skuSelectViewList;
        if (list2 == null || i >= list2.size()) {
            return;
        }
        this.skuSelectViewList.get(i).setCanSelect(z, list);
    }

    public void setAllCanSelect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b26d3d4", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.skuSelectViewList.size(); i++) {
            this.skuSelectViewList.get(i).reset();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.isOpened.set(false);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            return;
        }
        super.onCancel(dialogInterface);
        this.isOpened.set(false);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
        } else if (!this.isOpened.compareAndSet(false, true)) {
        } else {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (isAdded()) {
                beginTransaction.remove(this).commit();
                return;
            }
            beginTransaction.setTransition(4097);
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public void setData(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4457adb", new Object[]{this, jSONArray});
        } else {
            this.data = jSONArray;
        }
    }

    public void setItemInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b5446", new Object[]{this, jSONObject});
        } else {
            this.itemInfo = jSONObject;
        }
    }

    public void setSkuSelectListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c74db1", new Object[]{this, dVar});
        } else {
            this.iSkuSelectListener = dVar;
        }
    }

    public void setiSkuInitListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca188aa3", new Object[]{this, cVar});
        } else {
            this.iSkuInitListener = cVar;
        }
    }
}
