package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.os.CountDownTimer;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.OvsPopExt;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class HTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CountDownTimer countDownTimer;
    private View mAllChangeCountryLayout;
    private View mAllChooseCountryLayout;
    private TextView mCountryNameTextView;
    private EditionListAdapter mListAdapter;

    static {
        kge.a(569445599);
    }

    public static /* synthetic */ Object ipc$super(HTaoEditionSwitchView hTaoEditionSwitchView, String str, Object... objArr) {
        if (str.hashCode() == -893949262) {
            super.onDismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HTaoEditionSwitchView(Context context, int i, d dVar) {
        super(context, i, dVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_htao_dialog, this);
        this.mAllChangeCountryLayout = findViewById(R.id.all_change_country_layout);
        this.mAllChooseCountryLayout = findViewById(R.id.country_list_layout);
        this.mCountryNameTextView = (TextView) findViewById(R.id.textView_current_country);
        findViewById(R.id.btn_change_country_confirm).setOnClickListener(this);
        if (this.mViewType == 0) {
            this.mAllChangeCountryLayout.setVisibility(0);
            this.mAllChooseCountryLayout.setVisibility(8);
            initCurrentArea();
            return;
        }
        this.mAllChangeCountryLayout.setVisibility(8);
        this.mAllChooseCountryLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo c = com.taobao.android.editionswitcher.b.c(getContext());
        this.mCountryNameTextView.setText(c.countryName);
        this.mCountryNameTextView.setTag(c.countryCode);
        HImageView hImageView = (HImageView) findViewById(R.id.iv_change_country_reason);
        if (!StringUtils.isEmpty(c.ext.hTaoContentImg)) {
            hImageView.setPlaceHoldForeground(getResources().getDrawable(R.drawable.area_switch_service_other));
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
        this.countDownTimer = new CountDownTimer(numArr[0].intValue(), 1000L) { // from class: com.taobao.android.editionswitcher.homepage.HTaoEditionSwitchView.1
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
        LinkedHashMap<String, PositionInfo> a2 = com.taobao.android.editionswitcher.d.a();
        ArrayList arrayList = new ArrayList();
        for (String str : a2.keySet()) {
            if (!StringUtils.equals(str, "CUN") && !StringUtils.equals(str, "OLD")) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        PositionInfo b = com.taobao.android.editionswitcher.b.b(context);
        String obj = this.mCountryNameTextView.getTag() == null ? "" : this.mCountryNameTextView.getTag().toString();
        if (StringUtils.isEmpty(obj)) {
            obj = b == null ? "CN" : b.countryCode;
        }
        PositionInfo c = com.taobao.android.editionswitcher.b.c(context);
        int[] a3 = c.a((String[]) arrayList.toArray(new String[0]), obj, c == null ? "CN" : c.countryCode);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < a3.length; i2++) {
            a aVar = new a();
            aVar.f12297a = ((String) arrayList.get(a3[i2])).trim();
            aVar.b = a2.get(aVar.f12297a).countryName.trim();
            if (StringUtils.equals(aVar.f12297a, obj)) {
                aVar.d = true;
                z = true;
            } else {
                aVar.d = false;
            }
            if (StringUtils.equals(aVar.f12297a, "CN")) {
                i = i2;
            }
            arrayList2.add(aVar);
        }
        if (!z) {
            ((a) arrayList2.get(i)).d = true;
        }
        this.mListAdapter = new EditionListAdapter(arrayList2);
        listView.setAdapter((ListAdapter) this.mListAdapter);
        listView.setOnItemClickListener(this.mListAdapter);
    }

    @Override // com.taobao.android.editionswitcher.homepage.EditionSwitchView, android.view.View.OnClickListener
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
            this.mAllChangeCountryLayout.setVisibility(8);
            this.mAllChooseCountryLayout.setVisibility(0);
            this.mViewType = 1;
            loadAllAreas();
            traceShowEvent();
        } else if (id != R.id.btn_change_country_confirm) {
        } else {
            if (this.mViewType == 0) {
                processLocationChanged(view.getContext(), this.mCountryNameTextView.getTag() == null ? "CN" : (String) this.mCountryNameTextView.getTag(), false);
            } else if (this.mViewType != 1 || (editionListAdapter = this.mListAdapter) == null || (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) == null) {
            } else {
                processLocationChanged(view.getContext(), checkedAreaItem.f12297a, false);
            }
        }
    }

    @Override // com.taobao.android.editionswitcher.homepage.EditionSwitchView
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
