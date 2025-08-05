package com.taobao.browser.jsbridge.ui.chooseImg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.config.a;
import com.taobao.tao.log.statistics.d;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class ImgFileListActivity extends Activity implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImgFileListAdapter listAdapter;
    public ListView listView;
    public List<FileTraversal> localList;
    public ImgChooseUtils util;

    static {
        kge.a(844378353);
        kge.a(54921071);
    }

    public static /* synthetic */ Object ipc$super(ImgFileListActivity imgFileListActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.camera_imgfilelist);
        this.listView = (ListView) findViewById(R.id.listViewFolder);
        this.util = new ImgChooseUtils(this);
        this.localList = this.util.LocalImgFileList();
        ArrayList arrayList = new ArrayList();
        if (this.localList != null) {
            for (int i = 0; i < this.localList.size(); i++) {
                HashMap hashMap = new HashMap();
                hashMap.put(d.PARAM_UPLOAD_FILE_COUNT, riy.BRACKET_START_STR + this.localList.get(i).fileContent.size() + riy.BRACKET_END_STR);
                hashMap.put("imgPath", this.localList.get(i).fileContent.get(0) == null ? null : this.localList.get(i).fileContent.get(0));
                hashMap.put("fileName", this.localList.get(i).fileName);
                arrayList.add(hashMap);
            }
        }
        this.listAdapter = new ImgFileListAdapter(this, arrayList);
        this.listView.setAdapter((ListAdapter) this.listAdapter);
        this.listView.setOnItemClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            return;
        }
        Intent intent = new Intent(this, ImgsActivity.class);
        Bundle bundle = new Bundle();
        if (a.commonConfig.j) {
            bundle.putInt("index", i);
        } else {
            bundle.putParcelable("data", this.localList.get(i));
        }
        intent.putExtras(bundle);
        intent.putExtra("maxSelect", getIntent().getIntExtra("maxSelect", 9));
        startActivityForResult(intent, 210);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 210 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.listAdapter = null;
        ImgChooseUtils imgChooseUtils = this.util;
        if (imgChooseUtils != null) {
            imgChooseUtils.clear();
        }
        this.util = null;
        super.finish();
    }
}
