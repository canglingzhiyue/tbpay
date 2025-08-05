package com.taobao.detail.rate.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.view.e;
import com.taobao.detail.rate.widget.TagFlowLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.gbk;

/* loaded from: classes7.dex */
public class RateSkuTagLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int checkedIndex;
    private View containerView;
    private SparseBooleanArray disableList;
    private e iTagSelectListener;
    private Context mContext;
    private List<JSONObject> mLabels;
    private int mPostion;
    private com.taobao.detail.rate.view.adapter.a mtagAdapter;
    private String pid;
    private TagFlowLayout tagFlowLayout;
    private int tagSelectedCount;
    private String title;
    private TextView titleView;

    public static /* synthetic */ SparseBooleanArray access$000(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseBooleanArray) ipChange.ipc$dispatch("e9805c4b", new Object[]{rateSkuTagLayout}) : rateSkuTagLayout.disableList;
    }

    public static /* synthetic */ int access$100(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57cf068c", new Object[]{rateSkuTagLayout})).intValue() : rateSkuTagLayout.checkedIndex;
    }

    public static /* synthetic */ int access$102(RateSkuTagLayout rateSkuTagLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6493cbb", new Object[]{rateSkuTagLayout, new Integer(i)})).intValue();
        }
        rateSkuTagLayout.checkedIndex = i;
        return i;
    }

    public static /* synthetic */ int access$200(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("81235bcd", new Object[]{rateSkuTagLayout})).intValue() : rateSkuTagLayout.tagSelectedCount;
    }

    public static /* synthetic */ int access$202(RateSkuTagLayout rateSkuTagLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d77f8f9a", new Object[]{rateSkuTagLayout, new Integer(i)})).intValue();
        }
        rateSkuTagLayout.tagSelectedCount = i;
        return i;
    }

    public static /* synthetic */ int access$208(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaf8e7d5", new Object[]{rateSkuTagLayout})).intValue();
        }
        int i = rateSkuTagLayout.tagSelectedCount;
        rateSkuTagLayout.tagSelectedCount = i + 1;
        return i;
    }

    public static /* synthetic */ TagFlowLayout access$300(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TagFlowLayout) ipChange.ipc$dispatch("58c22ce1", new Object[]{rateSkuTagLayout}) : rateSkuTagLayout.tagFlowLayout;
    }

    public static /* synthetic */ List access$400(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("56d8c86b", new Object[]{rateSkuTagLayout}) : rateSkuTagLayout.mLabels;
    }

    public static /* synthetic */ e access$500(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("dcd78e2f", new Object[]{rateSkuTagLayout}) : rateSkuTagLayout.iTagSelectListener;
    }

    public static /* synthetic */ String access$600(RateSkuTagLayout rateSkuTagLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b3d5b82", new Object[]{rateSkuTagLayout}) : rateSkuTagLayout.pid;
    }

    public RateSkuTagLayout(Context context) {
        super(context);
        this.checkedIndex = -1;
        this.title = null;
        this.mPostion = 0;
        this.pid = null;
        this.disableList = new SparseBooleanArray();
        this.tagSelectedCount = 0;
        this.mContext = context;
        this.mLabels = new ArrayList();
        init();
    }

    public RateSkuTagLayout(Context context, JSONObject jSONObject) {
        super(context);
        this.checkedIndex = -1;
        this.title = null;
        this.mPostion = 0;
        this.pid = null;
        this.disableList = new SparseBooleanArray();
        this.tagSelectedCount = 0;
        this.mContext = context;
        this.title = jSONObject.getString("name");
        if (jSONObject.getJSONArray("values") != null) {
            this.mLabels = JSON.parseArray(jSONObject.getJSONArray("values").toJSONString(), JSONObject.class);
        }
        this.pid = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        init();
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject.getJSONArray("values") == null) {
        } else {
            this.mLabels = JSON.parseArray(jSONObject.getJSONArray("values").toJSONString(), JSONObject.class);
            com.taobao.detail.rate.view.adapter.a aVar = this.mtagAdapter;
            if (aVar == null) {
                return;
            }
            aVar.a(this.mLabels);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.containerView = LayoutInflater.from(this.mContext).inflate(R.layout.rate_sku_select_item_layout, (ViewGroup) null);
        this.tagFlowLayout = (TagFlowLayout) this.containerView.findViewById(R.id.rate_sku_item);
        this.titleView = (TextView) this.containerView.findViewById(R.id.rate_sku_name);
        if (!TextUtils.isEmpty(this.title)) {
            this.titleView.setText(this.title);
        }
        List<JSONObject> list = this.mLabels;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.containerView.setVisibility(8);
            return;
        }
        this.tagFlowLayout.setMaxSelectCount(1);
        this.tagFlowLayout.setMaxLine(this.mLabels.size());
        this.mtagAdapter = new com.taobao.detail.rate.view.adapter.a<JSONObject>(this.mLabels) { // from class: com.taobao.detail.rate.widget.RateSkuTagLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.view.adapter.a
            public View a(FlowLayout flowLayout, int i, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("ed8cbdc7", new Object[]{this, flowLayout, new Integer(i), jSONObject});
                }
                RateTagView rateTagView = new RateTagView(RateSkuTagLayout.this.getContext());
                boolean z = RateSkuTagLayout.access$000(RateSkuTagLayout.this).get(i, false);
                rateTagView.setTextColor(Color.parseColor("#333333"));
                rateTagView.setDisabled(z);
                String string = jSONObject.getString("name");
                Boolean valueOf = Boolean.valueOf(jSONObject.containsKey(gbk.TYPE_SELECTED) ? jSONObject.getBoolean(gbk.TYPE_SELECTED).booleanValue() : false);
                if (!TextUtils.isEmpty(string)) {
                    rateTagView.setText(string, 1);
                }
                if (valueOf.booleanValue()) {
                    RateSkuTagLayout.access$102(RateSkuTagLayout.this, i);
                    RateSkuTagLayout.access$208(RateSkuTagLayout.this);
                    RateSkuTagLayout.access$300(RateSkuTagLayout.this).addSelectView(i);
                    rateTagView.setChecked(true);
                } else {
                    rateTagView.setChecked(false);
                }
                return rateTagView;
            }
        };
        this.tagFlowLayout.setCancelSelect(true);
        this.tagFlowLayout.setAdapter(this.mtagAdapter);
        this.tagFlowLayout.setOnTagClickListener(new TagFlowLayout.b() { // from class: com.taobao.detail.rate.widget.RateSkuTagLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.widget.TagFlowLayout.b
            public boolean a(View view, int i, FlowLayout flowLayout) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("46d489ad", new Object[]{this, view, new Integer(i), flowLayout})).booleanValue();
                }
                if (RateSkuTagLayout.access$000(RateSkuTagLayout.this).get(i, false)) {
                    return false;
                }
                JSONObject jSONObject = (JSONObject) RateSkuTagLayout.access$400(RateSkuTagLayout.this).get(i);
                if (RateSkuTagLayout.access$500(RateSkuTagLayout.this) != null) {
                    Boolean valueOf = Boolean.valueOf(jSONObject.containsKey(gbk.TYPE_SELECTED) ? jSONObject.getBoolean(gbk.TYPE_SELECTED).booleanValue() : false);
                    jSONObject.put(gbk.TYPE_SELECTED, (Object) Boolean.valueOf(!valueOf.booleanValue()));
                    if (valueOf.booleanValue()) {
                        RateSkuTagLayout.access$202(RateSkuTagLayout.this, 0);
                    } else {
                        if (RateSkuTagLayout.access$100(RateSkuTagLayout.this) >= 0 && RateSkuTagLayout.access$200(RateSkuTagLayout.this) > 0) {
                            JSONObject jSONObject2 = (JSONObject) RateSkuTagLayout.access$400(RateSkuTagLayout.this).get(RateSkuTagLayout.access$100(RateSkuTagLayout.this));
                            jSONObject2.put(gbk.TYPE_SELECTED, (Object) false);
                            RateSkuTagLayout.access$202(RateSkuTagLayout.this, 0);
                            RateSkuTagLayout.access$500(RateSkuTagLayout.this).a(RateSkuTagLayout.access$600(RateSkuTagLayout.this), false, RateSkuTagLayout.access$100(RateSkuTagLayout.this), jSONObject2);
                        }
                        RateSkuTagLayout.access$102(RateSkuTagLayout.this, i);
                        RateSkuTagLayout.access$208(RateSkuTagLayout.this);
                    }
                    RateSkuTagLayout.access$500(RateSkuTagLayout.this).a(RateSkuTagLayout.access$600(RateSkuTagLayout.this), !valueOf.booleanValue(), i, jSONObject);
                }
                return true;
            }
        });
    }

    public void setTagSelectListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ea1d33", new Object[]{this, eVar});
        } else {
            this.iTagSelectListener = eVar;
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.checkedIndex = -1;
        this.tagSelectedCount = 0;
        this.disableList.clear();
        this.tagFlowLayout.getAdapter().c();
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.containerView;
    }

    public RateSkuTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.checkedIndex = -1;
        this.title = null;
        this.mPostion = 0;
        this.pid = null;
        this.disableList = new SparseBooleanArray();
        this.tagSelectedCount = 0;
        this.mContext = context;
        this.mLabels = new ArrayList();
        init();
    }

    public void setCanSelect(boolean z, List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338849b4", new Object[]{this, new Boolean(z), list});
            return;
        }
        this.disableList.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                this.disableList.put(list.get(i).intValue(), !z);
            }
        }
        this.mtagAdapter.d();
    }

    public int getPostion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7e92ac", new Object[]{this})).intValue() : this.mPostion;
    }

    public void setPostion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99d3276", new Object[]{this, new Integer(i)});
        } else {
            this.mPostion = i;
        }
    }

    public boolean hasTagSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("690d8c66", new Object[]{this})).booleanValue() : this.tagSelectedCount > 0;
    }
}
