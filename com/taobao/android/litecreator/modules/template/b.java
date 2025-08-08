package com.taobao.android.litecreator.modules.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.exporter.DraftExporter;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.TemplateSelector;
import com.alibaba.marvel.java.TemplateTag;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.litecreator.modules.template.c;
import com.taobao.android.litecreator.modules.template.d;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LcTemplateModel";

    /* renamed from: a  reason: collision with root package name */
    private c f13364a = new c();

    static {
        kge.a(-558092561);
    }

    public static /* synthetic */ c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("eff35b37", new Object[]{bVar}) : bVar.f13364a;
    }

    public static /* synthetic */ void a(b bVar, Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d347285", new Object[]{bVar, project});
        } else {
            bVar.a(project);
        }
    }

    public static /* synthetic */ void a(b bVar, TemplateInfo templateInfo, Project project, TemplateResult templateResult, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c56c77", new Object[]{bVar, templateInfo, project, templateResult, aVar});
        } else {
            bVar.a(templateInfo, project, templateResult, aVar);
        }
    }

    public static /* synthetic */ void a(b bVar, TemplateInfo templateInfo, List list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fee943a", new Object[]{bVar, templateInfo, list, aVar});
        } else {
            bVar.a(templateInfo, list, aVar);
        }
    }

    public TemplateSelector a(final Context context, final String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSelector) ipChange.ipc$dispatch("d5f2dcfa", new Object[]{this, context, str, str2});
        }
        Project createProject = Marvel.createProject();
        boolean load = createProject.load(str, new ResourceInspector() { // from class: com.taobao.android.litecreator.modules.template.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public ResourceInspector.Ret onResourceInspect(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ResourceInspector.Ret) ipChange2.ipc$dispatch("bea897c0", new Object[]{this, map});
                }
                String str3 = str;
                if (str3 != null && str3.endsWith("marvel.json")) {
                    b.a(b.this).a(context, str.substring(0, str.lastIndexOf("/")), map);
                }
                return ResourceInspector.Ret.Pass;
            }
        });
        u.d(TAG, "startExport: loadMarvelResult=" + load);
        if (!load) {
            return null;
        }
        TemplateEditor templateEditor = new TemplateEditor(createProject.getApp());
        templateEditor.setProject(createProject);
        File file = new File(str2);
        int i = -100;
        if (file.exists()) {
            i = createProject.loadTemplateMetaInfo(file.getPath());
            z = true;
        } else {
            z = false;
        }
        u.d(TAG, "startExport: resultCode=" + i);
        if (!z || i != 0) {
            return null;
        }
        TemplateSelector selectorTags = templateEditor.getSelectorTags("mediasPlaceHolders");
        createProject.destroy();
        return selectorTags;
    }

    public TemplateSelector a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSelector) ipChange.ipc$dispatch("e083d504", new Object[]{this, context, str});
        }
        return a(context, str + "/marvel.json", str + "/meta.json");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f13364a.a(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f13364a.b(str);
        }
    }

    public void a(Context context, final TemplateInfo templateInfo, final List<String> list, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a03b63a", new Object[]{this, context, templateInfo, list, aVar});
            return;
        }
        u.d(TAG, "export: itemId=" + templateInfo.itemId);
        if (StringUtils.isEmpty(templateInfo.templateRootPath) || !k.a(templateInfo.templateRootPath)) {
            aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "marvelJsonDirNotExist"), "", "templateRootPath null!");
        } else if (this.f13364a.a(templateInfo.templateRootPath)) {
            this.f13364a.a(context, new c.a() { // from class: com.taobao.android.litecreator.modules.template.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.modules.template.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        b.a(b.this, templateInfo, list, aVar);
                    }
                }

                @Override // com.taobao.android.litecreator.modules.template.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        b.a(b.this, templateInfo, list, aVar);
                    }
                }
            });
        } else if (this.f13364a.a()) {
            this.f13364a.a(context, new d.a() { // from class: com.taobao.android.litecreator.modules.template.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.modules.template.d.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        b.a(b.this, templateInfo, list, aVar);
                    }
                }

                @Override // com.taobao.android.litecreator.modules.template.d.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        b.a(b.this, templateInfo, list, aVar);
                    }
                }
            });
        } else {
            a(templateInfo, list, aVar);
        }
    }

    private void a(final TemplateInfo templateInfo, List<String> list, final a aVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460e2f32", new Object[]{this, templateInfo, list, aVar});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = templateInfo.templateRootPath;
        final String str2 = str + "/meta.json";
        final Project createProject = Marvel.createProject();
        boolean load = createProject.load(str + "/marvel.json", (ResourceInspector) null);
        u.d(TAG, "startExport: curProject.load isOK=" + load);
        if (!load) {
            aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_GET_CONFIG_FAIL, "marvelLoadMarvelJsonFailed"), "", "curProject loadResult fail!");
            return;
        }
        TemplateEditor templateEditor = new TemplateEditor(createProject.getApp());
        templateEditor.setProject(createProject);
        File file = new File(str2);
        int i = -100;
        if (file.exists()) {
            i = createProject.loadTemplateMetaInfo(file.getPath());
            z = true;
        } else {
            z = false;
        }
        u.d(TAG, "startExport: metaLoadResult=" + i);
        if (!z) {
            aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_SIM_FAIL, "metaJsonNotExist"), "", "curProject meta json loadResult fail!");
        } else if (i != 0) {
            aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_PERMISSION_FAIL, "metaJsonLoadMarvelJsonFailed"), "", "curProject meta json loadResult fail!");
        } else {
            TemplateSelector selectorTags = templateEditor.getSelectorTags("mediasPlaceHolders");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = selectorTags.tags.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Long.valueOf(((TemplateTag) selectorTags.tags.get(i2)).id));
                arrayList2.add(list.get(i2 % list.size()));
            }
            templateEditor.replacePlaceHolders(arrayList, arrayList2, 0L);
            final TemplateResult templateResult = new TemplateResult();
            templateResult.itemId = templateInfo.itemId;
            ImageExporter imageExporter = new ImageExporter();
            imageExporter.setWidth(createProject.getMeEditor().getCanvasWidth());
            imageExporter.setHeight(createProject.getMeEditor().getCanvasHeight());
            imageExporter.setBitmapListener(new ImageExporter.a() { // from class: com.taobao.android.litecreator.modules.template.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(long j, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e290dcb5", new Object[]{this, new Long(j), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), byteBuffer});
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer);
                    String c = n.c(Globals.getApplication());
                    if (!com.taobao.android.litecreator.util.c.a(createBitmap, c)) {
                        aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL, "marvelExportFailed"), "", "save bitmap fail");
                        return;
                    }
                    templateInfo.templateResultFile = c;
                    TemplateResult templateResult2 = templateResult;
                    templateResult2.resultPath = c;
                    templateResult2.metaJsonPath = str2;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    u.b(b.TAG, "onFrame: 合成时间=" + elapsedRealtime2);
                    au.c(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.b.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(b.this, templateInfo, createProject, templateResult, aVar);
                            }
                        }
                    });
                }
            });
            createProject.export(imageExporter);
        }
    }

    private void a(final TemplateInfo templateInfo, final Project project, final TemplateResult templateResult, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3188936f", new Object[]{this, templateInfo, project, templateResult, aVar});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        a(templateInfo, project, new com.taobao.android.litecreator.base.data.b<String>() { // from class: com.taobao.android.litecreator.modules.template.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.base.data.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                u.b(b.TAG, "合成后的exportDraft=> " + str);
                u.b(b.TAG, "onFrame: 草稿时间=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                TemplateInfo templateInfo2 = templateInfo;
                templateInfo2.templateDraftFile = str;
                TemplateResult templateResult2 = templateResult;
                templateResult2.draftPath = str;
                templateInfo2.result = templateResult2;
                templateInfo2.exportState = "finish";
                b.a(b.this, project);
                au.c(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.b.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (aVar == null) {
                        } else {
                            aVar.a(templateResult);
                        }
                    }
                });
            }
        }, new com.taobao.android.litecreator.base.data.b<String>() { // from class: com.taobao.android.litecreator.modules.template.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.base.data.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                u.d(b.TAG, "exportDraft onReceive: null ");
                b.a(b.this, project);
                aVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "draftExportFailed"), "", "draftExportFailed");
            }
        });
    }

    private void a(TemplateInfo templateInfo, Project project, final com.taobao.android.litecreator.base.data.b<String> bVar, final com.taobao.android.litecreator.base.data.b<String> bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbb33b", new Object[]{this, templateInfo, project, bVar, bVar2});
            return;
        }
        final String str = templateInfo.templateRootPath + "/" + project.hashCode() + "/" + System.currentTimeMillis() + ".json";
        DraftExporter draftExporter = new DraftExporter();
        draftExporter.setOutputPath(str);
        draftExporter.setOnCompleteListener(new OnCompleteListener() { // from class: com.taobao.android.litecreator.modules.template.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    au.a(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.b.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bVar.a(str);
                            }
                        }
                    });
                }
            }
        });
        draftExporter.setOnErrorListener(new OnErrorListener() { // from class: com.taobao.android.litecreator.modules.template.b.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onError(String str2, String str3, int i, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9c8c7f09", new Object[]{this, str2, str3, new Integer(i), str4});
                } else {
                    au.a(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.b.8.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bVar2.a(null);
                            }
                        }
                    });
                }
            }
        });
        project.export(draftExporter);
    }

    private void a(Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4c3c8d", new Object[]{this, project});
        } else {
            project.destroy();
        }
    }
}
