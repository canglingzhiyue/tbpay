package com.taobao.android.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.g;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fvb;
import tb.fve;
import tb.kge;

/* loaded from: classes6.dex */
public class DXTemplatePreviewActivity extends AppCompatActivity implements fve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FONTSIZE_FLAG = "fontSize";
    public static final String PREVIEW_DINAMIC_MODULE = "preview";
    public static final String PREVIEW_INFO = "previewInfo";
    public static final String PREVIEW_TAG = "DXTemplatePreviewActivity";
    private d adapter;
    public JSONArray array;
    private boolean canScrollVertical = true;
    private int currentLevel;
    public bd engineRouter;
    public LinearLayout linearLayout;
    private RecyclerView rvMainContainer;

    /* loaded from: classes6.dex */
    public interface DXPreviewInterface extends Serializable {
        void previewEngineDidInitialized(bd bdVar);
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14701a;
        public String b;

        static {
            kge.a(-567413951);
        }
    }

    static {
        kge.a(373809135);
        kge.a(-1579893205);
    }

    public static /* synthetic */ Object ipc$super(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
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

    public static /* synthetic */ void access$000(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae71e7f", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.refreshUI(jSONArray);
        }
    }

    public static /* synthetic */ d access$100(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5f94f803", new Object[]{dXTemplatePreviewActivity}) : dXTemplatePreviewActivity.adapter;
    }

    public static /* synthetic */ boolean access$200(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1807a25d", new Object[]{dXTemplatePreviewActivity})).booleanValue() : dXTemplatePreviewActivity.canScrollVertical;
    }

    public static /* synthetic */ boolean access$202(DXTemplatePreviewActivity dXTemplatePreviewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4f4f25d", new Object[]{dXTemplatePreviewActivity, new Boolean(z)})).booleanValue();
        }
        dXTemplatePreviewActivity.canScrollVertical = z;
        return z;
    }

    public static /* synthetic */ void access$300(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04d2a24", new Object[]{dXTemplatePreviewActivity, str});
        } else {
            dXTemplatePreviewActivity.downLoadMockData(str);
        }
    }

    public static /* synthetic */ void access$400(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7760c65", new Object[]{dXTemplatePreviewActivity, str});
        } else {
            dXTemplatePreviewActivity.log(str);
        }
    }

    public static /* synthetic */ void access$500(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673fed04", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.initEngineRouter(jSONArray);
        }
    }

    public static /* synthetic */ void access$600(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ceb4985", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.gotoImplPreviewInterface(jSONArray);
        }
    }

    public static /* synthetic */ void access$700(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3296a606", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.downLoadTemplate(jSONArray);
        }
    }

    public static /* synthetic */ void access$800(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c9655f", new Object[]{dXTemplatePreviewActivity});
        } else {
            dXTemplatePreviewActivity.showErrorDialog();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_template_preview);
        log(i.b.MEASURE_ONCREATE);
        overridePendingTransition(0, 0);
        this.currentLevel = com.taobao.android.dinamicx.monitor.c.a().b();
        this.rvMainContainer = (RecyclerView) findViewById(R.id.rv_main_container);
        this.linearLayout = (LinearLayout) findViewById(R.id.ll);
        ((TextView) findViewById(R.id.dinamic_preview_back)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                DXTemplatePreviewActivity.this.finish();
                DXTemplatePreviewActivity.this.overridePendingTransition(0, 0);
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.fontSize_select);
        initEngineRouter(null);
        initRecyclerView();
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.preview_array, R.layout.fontsize_spinner_item);
        createFromResource.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) createFromResource);
        spinner.setSelection(this.currentLevel, true);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3d2c76", new Object[]{this, adapterView});
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb0d7f99", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                    return;
                }
                TextView textView = (TextView) view;
                textView.setTextColor(-16777216);
                textView.setGravity(17);
                com.taobao.android.dinamicx.monitor.c.a().a(i);
                if (DXTemplatePreviewActivity.this.array == null) {
                    return;
                }
                DXTemplatePreviewActivity.this.engineRouter.d().k();
                DXTemplatePreviewActivity dXTemplatePreviewActivity = DXTemplatePreviewActivity.this;
                DXTemplatePreviewActivity.access$000(dXTemplatePreviewActivity, dXTemplatePreviewActivity.array);
                DXTemplatePreviewActivity.access$100(DXTemplatePreviewActivity.this).notifyDataSetChanged();
            }
        });
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(PREVIEW_INFO);
            String stringExtra2 = intent.getStringExtra("fontSize");
            if (!StringUtils.isEmpty(stringExtra2) ? Boolean.valueOf(stringExtra2).booleanValue() : false) {
                spinner.setVisibility(0);
            } else {
                spinner.setVisibility(8);
            }
            if (!StringUtils.isEmpty(stringExtra)) {
                log("onCreate info :" + stringExtra);
                downLoadMockData(stringExtra);
                return;
            }
            finish();
            log("onCreate info isEmpty");
        } catch (Throwable th) {
            finish();
            th.printStackTrace();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        log("onResume");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        log("onNewIntent");
        try {
            String stringExtra = intent.getStringExtra(PREVIEW_INFO);
            if (!StringUtils.isEmpty(stringExtra)) {
                log("onNewIntent" + stringExtra);
                downLoadMockData(stringExtra);
                return;
            }
            finish();
            log("onNewIntent info isEmpty");
        } catch (Throwable th) {
            finish();
            th.printStackTrace();
        }
    }

    private void initRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313033b", new Object[]{this});
        } else {
            this.rvMainContainer.setLayoutManager(new StaggeredGridLayoutManager(2, 1) { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : DXTemplatePreviewActivity.access$200(DXTemplatePreviewActivity.this);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (android.text.StringUtils.isEmpty(r6) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initEngineRouter(com.alibaba.fastjson.JSONArray r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.preview.DXTemplatePreviewActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            r1[r4] = r6
            java.lang.String r6 = "a86f158a"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            if (r6 == 0) goto L30
            com.alibaba.fastjson.JSONObject r6 = r6.getJSONObject(r2)
            java.lang.String r0 = "__preview__"
            com.alibaba.fastjson.JSONObject r6 = r6.getJSONObject(r0)
            if (r6 == 0) goto L30
            java.lang.String r0 = "bizType"
            java.lang.String r6 = r6.getString(r0)
            boolean r0 = android.text.StringUtils.isEmpty(r6)
            if (r0 != 0) goto L30
            goto L33
        L30:
            java.lang.String r6 = "preview"
        L33:
            com.taobao.android.dinamicx.DXEngineConfig$a r0 = new com.taobao.android.dinamicx.DXEngineConfig$a
            r0.<init>(r6)
            com.taobao.android.dinamicx.DXEngineConfig$a r6 = r0.d(r4)
            com.taobao.android.dinamicx.DXEngineConfig$a r6 = r6.a(r4, r4)
            com.taobao.android.dinamicx.DXEngineConfig$a r6 = r6.e(r3)
            com.taobao.android.dinamicx.DXEngineConfig$a r6 = r6.f(r4)
            com.taobao.android.dinamicx.DXEngineConfig r6 = r6.a()
            com.taobao.android.dinamicx.bd r0 = new com.taobao.android.dinamicx.bd
            r0.<init>(r6)
            r5.engineRouter = r0
            com.taobao.android.dinamicx.bd r6 = r5.engineRouter
            r6.a(r5)
            com.taobao.android.dinamicx.bd r6 = r5.engineRouter
            com.taobao.android.dinamicx.DinamicXEngine r6 = r6.d()
            r6.a(r5)
            com.taobao.android.dinamicx.bd r6 = r5.engineRouter
            com.taobao.android.dinamicx.DinamicXEngine r6 = r6.d()
            com.taobao.android.dinamicx.eventchain.n r0 = new com.taobao.android.dinamicx.eventchain.n
            r0.<init>()
            java.lang.String r1 = "dxLog"
            java.lang.String r2 = "logAk"
            r6.a(r1, r2, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "完成engine的初始化 "
            r6.append(r0)
            com.taobao.android.dinamicx.bd r0 = r5.engineRouter
            java.lang.String r0 = r0.a()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.preview.DXTemplatePreviewActivity.initEngineRouter(com.alibaba.fastjson.JSONArray):void");
    }

    private void showErrorDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de93453a", new Object[]{this});
            return;
        }
        b.a aVar = new b.a(this);
        aVar.b("获取mock数据失败，是否重试？").a("提示");
        aVar.a("重试", new DialogInterface.OnClickListener() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                DXTemplatePreviewActivity dXTemplatePreviewActivity = DXTemplatePreviewActivity.this;
                DXTemplatePreviewActivity.access$300(dXTemplatePreviewActivity, dXTemplatePreviewActivity.getIntent().getStringExtra(DXTemplatePreviewActivity.PREVIEW_INFO));
            }
        });
        aVar.b("返回", new DialogInterface.OnClickListener() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                DXTemplatePreviewActivity.this.finish();
            }
        });
        aVar.b().show();
    }

    private void refreshUI(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25968de", new Object[]{this, jSONArray});
            return;
        }
        log("refreshUI");
        this.array = jSONArray;
        d dVar = this.adapter;
        if (dVar == null) {
            this.adapter = new d(this, jSONArray, this.rvMainContainer, this.engineRouter);
            this.rvMainContainer.setAdapter(this.adapter);
            return;
        }
        dVar.a(jSONArray);
    }

    private void downLoadTemplate(JSONArray jSONArray) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5bcdf1", new Object[]{this, jSONArray});
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                DXTemplateItem dinamicTemplate = getDinamicTemplate((JSONObject) it.next());
                if (dinamicTemplate != null) {
                    arrayList.add(dinamicTemplate);
                }
                if (!z) {
                    if (this.engineRouter.a(dinamicTemplate) != null) {
                        z = true;
                    }
                }
            }
        }
        log("开始下载模版");
        this.engineRouter.a(arrayList);
        if (!z) {
            return;
        }
        log("模版已经存在，直接刷新");
        this.adapter.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.preview.DXTemplatePreviewActivity$6] */
    private void downLoadMockData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c7ead", new Object[]{this, str});
        } else {
            new AsyncTask<String, Void, JSONArray>() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [com.alibaba.fastjson.JSONArray, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ JSONArray doInBackground(String[] strArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(JSONArray jSONArray) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, jSONArray});
                    } else {
                        a(jSONArray);
                    }
                }

                public JSONArray a(String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONArray) ipChange2.ipc$dispatch("2cbc73a7", new Object[]{this, strArr});
                    }
                    try {
                        byte[] a2 = new g().a(strArr[0]);
                        String str2 = a2 != null ? new String(a2) : null;
                        if (str2 == null) {
                            return null;
                        }
                        DXTemplatePreviewActivity dXTemplatePreviewActivity = DXTemplatePreviewActivity.this;
                        DXTemplatePreviewActivity.access$400(dXTemplatePreviewActivity, "respnese.body =" + str2);
                        return JSON.parseArray(str2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void a(JSONArray jSONArray) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                    } else if (jSONArray != null && jSONArray.size() > 0) {
                        DXTemplatePreviewActivity.access$400(DXTemplatePreviewActivity.this, "获取mock数据成功");
                        JSONObject jSONObject = jSONArray.getJSONObject(0);
                        if (jSONObject.containsKey("dx_canScrollVertical")) {
                            DXTemplatePreviewActivity.access$202(DXTemplatePreviewActivity.this, jSONObject.getBoolean("dx_canScrollVertical").booleanValue());
                        }
                        DXTemplatePreviewActivity.access$500(DXTemplatePreviewActivity.this, jSONArray);
                        DXTemplatePreviewActivity.access$600(DXTemplatePreviewActivity.this, jSONArray);
                        DXTemplatePreviewActivity.access$000(DXTemplatePreviewActivity.this, jSONArray);
                        DXTemplatePreviewActivity.access$700(DXTemplatePreviewActivity.this, jSONArray);
                    } else {
                        DXTemplatePreviewActivity.access$800(DXTemplatePreviewActivity.this);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
        }
    }

    public static DXTemplateItem getDinamicTemplate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12011409", new Object[]{jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            return null;
        }
        dXTemplateItem.f11925a = jSONObject2.getString("name");
        dXTemplateItem.b = Long.parseLong(jSONObject2.getString("version"));
        dXTemplateItem.c = jSONObject2.getString("url");
        return dXTemplateItem;
    }

    @Override // tb.fve
    public void onNotificationListener(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
        } else if (fvbVar == null) {
        } else {
            if (fvbVar.c != null && fvbVar.c.size() > 0) {
                if (fvbVar.c.get(0).c == 1000) {
                    this.adapter.a();
                    log("收到降级刷新请求开始刷新: " + fvbVar.c.get(0).c);
                } else {
                    log(" 收到 templateUpdateRequestList: " + fvbVar.c.get(0).c);
                }
            } else if (fvbVar.f28139a != null && fvbVar.f28139a.size() > 0) {
                log("收到下载新请求开始刷新" + fvbVar.f28139a.get(0).toString());
            }
            refreshUI(this.array);
            this.adapter.notifyDataSetChanged();
        }
    }

    private void gotoImplPreviewInterface(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d8be43", new Object[]{this, jSONArray});
            return;
        }
        log("开始进行组建注册");
        List<a> previewInfoList = getPreviewInfoList(jSONArray);
        if (previewInfoList == null) {
            return;
        }
        for (int i = 0; i < previewInfoList.size(); i++) {
            callMethod(previewInfoList.get(i));
        }
    }

    private void callMethod(a aVar) {
        if (aVar != null && !StringUtils.isEmpty(aVar.b)) {
            try {
                Class<?> cls = Class.forName(aVar.b);
                cls.getMethod("previewEngineDidInitialized", bd.class).invoke(cls.newInstance(), this.engineRouter);
            } catch (Throwable unused) {
            }
        }
    }

    private List<a> getPreviewInfoList(JSONArray jSONArray) {
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e86c1fda", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("__preview__");
            if (jSONObject != null && (jSONArray2 = jSONObject.getJSONArray("android")) != null) {
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        a aVar = new a();
                        aVar.b = jSONObject2.getString("className");
                        aVar.f14701a = jSONObject2.getString("bundlerPath");
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        log(MessageID.onDestroy);
        com.taobao.android.dinamicx.monitor.c.a().a(this.currentLevel);
        this.engineRouter.d().o();
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        Log.e(PREVIEW_TAG, str + " : " + System.currentTimeMillis());
    }
}
