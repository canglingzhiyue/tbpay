package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class CTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mAllChangeAreaLayout;
    private View mAllChooseAreaLayout;
    private ImageView mAreaImageView;
    private TextView mAreaNameTextView;
    private TextView mChangeAreaConfirmTextView;
    private TextView mChangeAreaReasonTextView;
    private EditionListAdapter mListAdapter;

    static {
        kge.a(-487308966);
    }

    public static /* synthetic */ Object ipc$super(CTaoEditionSwitchView cTaoEditionSwitchView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CTaoEditionSwitchView(Context context, int i, d dVar) {
        super(context, i, dVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_ctao_dialog, this);
        this.mAllChangeAreaLayout = findViewById(R.id.all_change_area_layout);
        this.mAllChooseAreaLayout = findViewById(R.id.area_list_layout);
        this.mAreaNameTextView = (TextView) findViewById(R.id.textView_current_area);
        this.mAreaImageView = (ImageView) findViewById(R.id.iv_area);
        this.mChangeAreaReasonTextView = (TextView) findViewById(R.id.textView_change_area_reason);
        this.mChangeAreaConfirmTextView = (TextView) findViewById(R.id.tv_change_area_confirm);
        findViewById(R.id.btn_change_area_confirm).setOnClickListener(this);
        if (this.mViewType == 0) {
            this.mAllChangeAreaLayout.setVisibility(0);
            this.mAllChooseAreaLayout.setVisibility(8);
            initCurrentArea();
            return;
        }
        this.mAllChangeAreaLayout.setVisibility(8);
        this.mAllChooseAreaLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo c = com.taobao.android.editionswitcher.b.c(getContext());
        this.mAreaNameTextView.setTag(c.editionCode);
        if (TextUtils.isEmpty(c.area)) {
            String[] stringArray = getResources().getStringArray(R.array.edition_area_ctao_names);
            if (TextUtils.equals(c.editionCode, "CUN")) {
                this.mAreaNameTextView.setText(stringArray[1]);
            } else {
                this.mAreaNameTextView.setText(stringArray[0]);
            }
        } else {
            this.mAreaNameTextView.setText(c.area);
        }
        TextView textView = (TextView) findViewById(R.id.textView_change_area_reason);
        if (TextUtils.equals(c.editionCode, "CUN")) {
            textView.setText(getResources().getString(R.string.area_switch_ctao_reason));
        } else if (!com.taobao.android.editionswitcher.b.l(getContext()) && com.taobao.android.editionswitcher.b.k(getContext())) {
            textView.setText(getResources().getString(R.string.area_switch_ctao_reason));
            this.mAreaNameTextView.setTag("CUN");
        } else {
            textView.setText(getResources().getString(R.string.area_switch_mainland_reason));
        }
    }

    private void loadAllAreas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ListView listView = (ListView) findViewById(R.id.listView_areas);
        String[] stringArray = context.getResources().getStringArray(R.array.edition_area_ctao_ids);
        String[] stringArray2 = context.getResources().getStringArray(R.array.edition_area_ctao_names);
        ArrayList arrayList = new ArrayList();
        String str = com.taobao.android.editionswitcher.b.b(getContext()).editionCode;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            a aVar = new a();
            aVar.f12297a = stringArray[i2].trim();
            aVar.b = stringArray2[i2].trim();
            if (TextUtils.equals(aVar.f12297a, str)) {
                aVar.d = true;
                z = true;
            } else {
                aVar.d = false;
            }
            if (TextUtils.equals(aVar.f12297a, "CN")) {
                i = i2;
            }
            arrayList.add(aVar);
        }
        if (!z) {
            ((a) arrayList.get(i)).d = true;
        }
        this.mListAdapter = new EditionListAdapter(arrayList);
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
        } else if (view.getId() != R.id.btn_change_area_confirm) {
        } else {
            if (this.mViewType == 0) {
                processLocationChanged(view.getContext(), this.mAreaNameTextView.getTag() == null ? "CN" : (String) this.mAreaNameTextView.getTag(), false);
            } else if (this.mViewType != 1 || (editionListAdapter = this.mListAdapter) == null || (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) == null) {
            } else {
                processLocationChanged(view.getContext(), checkedAreaItem.f12297a, false);
            }
        }
    }

    public void setAreaName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a3024b", new Object[]{this, str});
        } else if (this.mAreaNameTextView == null || this.mViewType != 0 || TextUtils.isEmpty(str)) {
        } else {
            this.mAreaNameTextView.setText(str);
        }
    }

    public void setChangeAreaReason(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("301de7d4", new Object[]{this, str});
        } else if (this.mChangeAreaReasonTextView == null || this.mViewType != 0 || TextUtils.isEmpty(str)) {
        } else {
            this.mChangeAreaReasonTextView.setText(str);
        }
    }

    public void setChangeAreaConfirmText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d58443f", new Object[]{this, str});
        } else if (this.mChangeAreaConfirmTextView == null || this.mViewType != 0 || TextUtils.isEmpty(str)) {
        } else {
            this.mChangeAreaConfirmTextView.setText(str);
        }
    }

    public void useNewAreaIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16711566", new Object[]{this});
        } else if (this.mAreaImageView == null || this.mViewType != 0) {
        } else {
            this.mAreaImageView.setImageResource(R.drawable.new_locator);
        }
    }
}
