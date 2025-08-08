package com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.request.size.model.RoleSize;
import com.taobao.taobao.R;
import java.util.BitSet;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class RoleSizeRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private ListView mDropdownListView;
    private boolean mEditable;
    private BitSet mMask;
    public PopupWindow mPopupWindow;
    private int mPosition;
    private RoleSize.SizeDo mReadOnlySizeDo;
    private RoleSizeDropDownAdapter mRoleSizeDropDownAdapter;
    private RoleSize.SizeDo mWritableSizeDo;
    public TextView tvColumnTitle;
    public TextView tvColumnVal;
    public View vContentView;

    static {
        kge.a(-1404063922);
        kge.a(-1201612728);
        kge.a(54921071);
    }

    public static /* synthetic */ Object ipc$super(RoleSizeRecyclerViewHolder roleSizeRecyclerViewHolder, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RoleSizeRecyclerViewHolder(View view, Context context) {
        super(view);
        this.mContext = context;
        this.vContentView = view;
        this.tvColumnTitle = (TextView) view.findViewById(R.id.tv_listitem_my_size_chart_title);
        this.tvColumnVal = (TextView) view.findViewById(R.id.tv_listitem_my_size_chart_val);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeRecyclerViewHolder");
    }

    public void fillData(RoleSize.SizeDo sizeDo, RoleSize.SizeDo sizeDo2, boolean z, int i, BitSet bitSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a98ad63", new Object[]{this, sizeDo, sizeDo2, new Boolean(z), new Integer(i), bitSet});
            return;
        }
        this.mWritableSizeDo = sizeDo2;
        this.mReadOnlySizeDo = sizeDo;
        this.mMask = bitSet;
        this.mPosition = i;
        this.mEditable = z;
        RoleSize.SizeDo sizeDo3 = z ? this.mWritableSizeDo : this.mReadOnlySizeDo;
        String str = "";
        this.tvColumnVal.setText(sizeDo3.value == null ? str : sizeDo3.value);
        String str2 = sizeDo3.tip == null ? str : sizeDo3.tip;
        if (sizeDo3.title != null) {
            str = sizeDo3.title;
        }
        SpannableString spannableString = new SpannableString(str + str2);
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.detail_6)), str.length(), spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(10, true), str.length(), spannableString.length(), 33);
        this.tvColumnTitle.setText(spannableString);
        this.vContentView.setOnClickListener(this);
        this.vContentView.setEnabled(z);
        updateUI();
    }

    private void initPopWindow(RoleSize.SizeDo sizeDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47a583b", new Object[]{this, sizeDo});
        } else if (this.mPopupWindow != null) {
        } else {
            View inflate = View.inflate(this.mContext, R.layout.x_detail_include_my_size_chart_dropdown, null);
            this.mPopupWindow = new PopupWindow(inflate, epo.b(55), epo.b(204));
            this.mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
            this.mPopupWindow.setOutsideTouchable(true);
            this.mPopupWindow.setFocusable(true);
            this.mDropdownListView = (ListView) inflate.findViewById(R.id.detail_my_size_chart_dropdown);
            this.mDropdownListView.setOnItemClickListener(this);
            this.mRoleSizeDropDownAdapter = new RoleSizeDropDownAdapter(this.mContext, sizeDo.max, sizeDo.min);
            this.mDropdownListView.setAdapter((ListAdapter) this.mRoleSizeDropDownAdapter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeRecyclerViewHolder.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "8dfcefe2"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            com.taobao.android.detail.wrapper.request.size.model.RoleSize$SizeDo r0 = r4.mWritableSizeDo
            if (r0 != 0) goto L1a
            return
        L1a:
            android.widget.PopupWindow r1 = r4.mPopupWindow
            if (r1 != 0) goto L21
            r4.initPopWindow(r0)
        L21:
            int r5 = r5.getWidth()
            com.taobao.android.detail.wrapper.request.size.model.RoleSize$SizeDo r0 = r4.mWritableSizeDo
            java.lang.String r0 = r0.value
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 != 0) goto L38
            com.taobao.android.detail.wrapper.request.size.model.RoleSize$SizeDo r0 = r4.mWritableSizeDo     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r0.value     // Catch: java.lang.Exception -> L38
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L38
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 > 0) goto L45
            com.taobao.android.detail.wrapper.request.size.model.RoleSize$SizeDo r0 = r4.mWritableSizeDo
            int r0 = r0.max
            com.taobao.android.detail.wrapper.request.size.model.RoleSize$SizeDo r1 = r4.mWritableSizeDo
            int r1 = r1.min
            int r0 = r0 - r1
            int r0 = r0 / r2
        L45:
            if (r0 < 0) goto L54
            com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeDropDownAdapter r1 = r4.mRoleSizeDropDownAdapter
            int r1 = r1.getCount()
            if (r0 >= r1) goto L54
            android.widget.ListView r1 = r4.mDropdownListView
            r1.setSelection(r0)
        L54:
            android.widget.PopupWindow r0 = r4.mPopupWindow
            r0.setWidth(r5)
            android.widget.PopupWindow r5 = r4.mPopupWindow
            android.widget.TextView r0 = r4.tvColumnVal
            r5.showAsDropDown(r0, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeRecyclerViewHolder.onClick(android.view.View):void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            return;
        }
        RoleSize.SizeDo sizeDo = this.mWritableSizeDo;
        if (sizeDo == null) {
            return;
        }
        String valueOf = String.valueOf(sizeDo.min + i);
        this.mWritableSizeDo.value = valueOf;
        this.tvColumnVal.setText(valueOf);
        updateUI();
        this.mPopupWindow.dismiss();
    }

    private void updateUI() {
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e0e324", new Object[]{this});
            return;
        }
        if (!this.mEditable) {
            color = this.mContext.getResources().getColor(R.color.detail_text_bold);
        } else if (this.mReadOnlySizeDo.value != null && this.mReadOnlySizeDo.value.equalsIgnoreCase(this.mWritableSizeDo.value)) {
            color = this.mContext.getResources().getColor(R.color.detail_4a90e2);
            this.mMask.clear(this.mPosition);
        } else {
            this.mMask.set(this.mPosition);
            color = this.mContext.getResources().getColor(R.color.detail_theme_color);
        }
        this.tvColumnVal.setTextColor(color);
    }
}
