package com.taobao.android.editionswitcher;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class OldEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View allChooseEditionLayout;
    private EditionListAdapter listAdapter;
    private View switchEditonMainLayout;
    private View switchEditonOldLayout;

    static {
        kge.a(-967747629);
    }

    public static /* synthetic */ Object ipc$super(OldEditionSwitchView oldEditionSwitchView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public OldEditionSwitchView(Context context, int i, h hVar) {
        super(context, i, hVar);
        init(context);
    }

    public OldEditionSwitchView(Context context, AttributeSet attributeSet, int i, h hVar) {
        super(context, i, hVar);
        init(context);
    }

    public OldEditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, h hVar) {
        super(context, i2, hVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_old_dialog, this);
        this.switchEditonMainLayout = findViewById(R.id.switch_edition_main_layout);
        this.switchEditonOldLayout = findViewById(R.id.switch_edition_old_layout);
        this.allChooseEditionLayout = findViewById(R.id.area_list_layout);
        findViewById(R.id.btn_edition_confirm).setOnClickListener(this);
        if (this.viewType == 0) {
            this.allChooseEditionLayout.setVisibility(8);
            if (l.j(getContext())) {
                this.switchEditonMainLayout.setVisibility(0);
                this.switchEditonOldLayout.setVisibility(8);
                setTag("CN");
                return;
            }
            this.switchEditonOldLayout.setVisibility(0);
            this.switchEditonMainLayout.setVisibility(8);
            setTag("OLD");
            PositionInfo c = l.c(getContext());
            ((TextView) findViewById(R.id.textView_edition_title)).setText(c.ext.oldDialogTitle);
            ((TextView) findViewById(R.id.textView_edition_subTitle)).setText(c.ext.oldDialogSubTitle);
            ((TUrlImageView) findViewById(R.id.imageView_edition_content)).setImageUrl(c.ext.oldDialogContentImg);
            ((TextView) findViewById(R.id.textview_edition_confirm)).setText(R.string.area_switch_btn_name_enter_choose);
            return;
        }
        this.switchEditonMainLayout.setVisibility(8);
        this.switchEditonOldLayout.setVisibility(8);
        this.allChooseEditionLayout.setVisibility(0);
        loadAllAreas();
    }

    private void loadAllAreas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ListView listView = (ListView) findViewById(R.id.listView_areas);
        String[] stringArray = context.getResources().getStringArray(R.array.edition_area_old_ids);
        String[] stringArray2 = context.getResources().getStringArray(R.array.edition_area_old_names);
        ArrayList arrayList = new ArrayList();
        String str = l.b(getContext()).editionCode;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            a aVar = new a();
            aVar.f12260a = stringArray[i2].trim();
            aVar.b = stringArray2[i2].trim();
            if (TextUtils.equals(aVar.f12260a, str)) {
                aVar.c = true;
                z = true;
            } else {
                aVar.c = false;
            }
            if (TextUtils.equals(aVar.f12260a, "CN")) {
                i = i2;
            }
            arrayList.add(aVar);
        }
        if (!z) {
            ((a) arrayList.get(i)).c = true;
        }
        this.listAdapter = new EditionListAdapter(arrayList);
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
        } else if (view.getId() != R.id.btn_edition_confirm) {
        } else {
            if (this.viewType == 0) {
                processLocationChanged(view.getContext(), getTag() == null ? "CN" : (String) getTag(), false);
            } else if (this.viewType != 1 || (editionListAdapter = this.listAdapter) == null || (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) == null) {
            } else {
                processLocationChanged(view.getContext(), checkedAreaItem.f12260a, false);
            }
        }
    }
}
