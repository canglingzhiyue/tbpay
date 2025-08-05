package com.taobao.android.editionswitcher;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class HTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View allChangeCountryLayout;
    private View allChooseCountryLayout;
    private CountDownTimer countDownTimer;
    private TextView countryNameTextView;
    private EditionListAdapter listAdapter;

    static {
        kge.a(1649410778);
    }

    public static /* synthetic */ Object ipc$super(HTaoEditionSwitchView hTaoEditionSwitchView, String str, Object... objArr) {
        if (str.hashCode() == -893949262) {
            super.onDismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HTaoEditionSwitchView(Context context, int i, h hVar) {
        super(context, i, hVar);
        init(context);
    }

    public HTaoEditionSwitchView(Context context, AttributeSet attributeSet, int i, h hVar) {
        super(context, i, hVar);
        init(context);
    }

    public HTaoEditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, h hVar) {
        super(context, i2, hVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_htao_dialog, this);
        this.allChangeCountryLayout = findViewById(R.id.all_change_country_layout);
        this.allChooseCountryLayout = findViewById(R.id.country_list_layout);
        this.countryNameTextView = (TextView) findViewById(R.id.textView_current_country);
        findViewById(R.id.btn_change_country_confirm).setOnClickListener(this);
        if (this.viewType == 0) {
            this.allChangeCountryLayout.setVisibility(0);
            this.allChooseCountryLayout.setVisibility(8);
            initCurrentArea();
            return;
        }
        this.allChangeCountryLayout.setVisibility(8);
        this.allChooseCountryLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo c = l.c(getContext());
        this.countryNameTextView.setText(c.countryName);
        this.countryNameTextView.setTag(c.countryCode);
        HImageView hImageView = (HImageView) findViewById(R.id.iv_change_country_reason);
        if (!TextUtils.isEmpty(c.ext.hTaoContentImg)) {
            if ("KR".equals(c.countryCode) || "GLOBAL".equals(c.countryCode)) {
                hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.homepage_area_switch_service_kr_global));
            } else {
                hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.homepage_area_switch_service_other));
            }
        }
        hImageView.setImageUrl(c.ext.hTaoContentImg);
        ((TextView) findViewById(R.id.textView_change_country_hint)).setText(String.format(getResources().getString(R.string.area_switch_htao_change_hint), c.countryName));
        processSwitchEdition(c);
    }

    private void processSwitchEdition(final PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b59fa5", new Object[]{this, positionInfo});
            return;
        }
        OvsPopExt ovsPopExt = positionInfo.ovsPopExt;
        final TextView textView = (TextView) findViewById(R.id.tv_confirm);
        this.remindKind = ovsPopExt.ovsRemindKind;
        if (ovsPopExt.ovsRemindKind != 1) {
            textView.setText(String.format(getResources().getString(R.string.area_switch_btn_name_confirm_change), positionInfo.countryName));
            return;
        }
        final Integer[] numArr = {Integer.valueOf((ovsPopExt.ovsRemindCountDown * 1000) + 1000)};
        final String string = getResources().getString(R.string.area_switch_btn_name_confirm_change_countdown);
        textView.setText(String.format(string, Integer.valueOf(numArr[0].intValue() / 1000), positionInfo.countryName));
        this.countDownTimer = new CountDownTimer(numArr[0].intValue(), 1000L) { // from class: com.taobao.android.editionswitcher.HTaoEditionSwitchView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                    return;
                }
                Integer[] numArr2 = numArr;
                numArr2[0] = Integer.valueOf(numArr2[0].intValue() - 1000);
                textView.setText(String.format(string, Integer.valueOf(numArr[0].intValue() / 1000), positionInfo.countryName));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                HTaoEditionSwitchView hTaoEditionSwitchView = HTaoEditionSwitchView.this;
                hTaoEditionSwitchView.processLocationChanged(hTaoEditionSwitchView.getContext(), positionInfo.countryCode, true);
            }
        };
        this.countDownTimer.start();
    }

    private void loadAllAreas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ((TextView) findViewById(R.id.tv_confirm)).setText(R.string.area_switch_btn_name_confirm_choose);
        ListView listView = (ListView) findViewById(R.id.listView_countries);
        LinkedHashMap<String, PositionInfo> a2 = d.a();
        ArrayList arrayList = new ArrayList();
        for (String str : a2.keySet()) {
            if (!TextUtils.equals(str, "CUN") && !TextUtils.equals(str, "OLD")) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        PositionInfo b = l.b(context);
        String obj = this.countryNameTextView.getTag() == null ? "" : this.countryNameTextView.getTag().toString();
        if (TextUtils.isEmpty(obj)) {
            obj = b == null ? "CN" : b.countryCode;
        }
        PositionInfo c = l.c(context);
        int[] a3 = g.a((String[]) arrayList.toArray(new String[0]), obj, c == null ? "CN" : c.countryCode);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < a3.length; i2++) {
            a aVar = new a();
            aVar.f12260a = ((String) arrayList.get(a3[i2])).trim();
            aVar.b = a2.get(aVar.f12260a).countryName.trim();
            if (TextUtils.equals(aVar.f12260a, obj)) {
                aVar.c = true;
                z = true;
            } else {
                aVar.c = false;
            }
            if (TextUtils.equals(aVar.f12260a, "CN")) {
                i = i2;
            }
            arrayList2.add(aVar);
        }
        if (!z) {
            ((a) arrayList2.get(i)).c = true;
        }
        this.listAdapter = new EditionListAdapter(arrayList2);
        listView.setAdapter((ListAdapter) this.listAdapter);
        listView.setOnItemClickListener(this.listAdapter);
    }

    @Override // com.taobao.android.editionswitcher.EditionSwitchView, android.view.View.OnClickListener
    public void onClick(View view) {
        EditionListAdapter editionListAdapter;
        a checkedAreaItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.change_country_layout) {
            this.allChangeCountryLayout.setVisibility(8);
            this.allChooseCountryLayout.setVisibility(0);
            this.viewType = 1;
            loadAllAreas();
            traceShowEvent();
        } else if (id != R.id.btn_change_country_confirm) {
        } else {
            if (this.viewType == 0) {
                processLocationChanged(view.getContext(), this.countryNameTextView.getTag() == null ? "CN" : (String) this.countryNameTextView.getTag(), false);
            } else if (this.viewType != 1 || (editionListAdapter = this.listAdapter) == null || (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) == null) {
            } else {
                processLocationChanged(view.getContext(), checkedAreaItem.f12260a, false);
            }
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            com.taobao.android.behavix.h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, str5);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.editionswitcher.EditionSwitchView
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
    }
}
