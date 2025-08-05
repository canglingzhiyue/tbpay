package tb;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SharedMemory;
import android.system.ErrnoException;
import com.alibaba.ability.impl.photo.b;
import com.huawei.nb.searchmanager.client.exception.SearchResult;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.nb.searchmanager.utils.SharedMemoryHelper;
import com.huawei.nb.searchmanager.utils.logger.DSLog;
import com.huawei.searchabilitymanager.client.model.SearchableItemAttributeSet;
import com.huawei.searchservice.service.IHOSPSearchServiceCall;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class cxx {
    private final Context b;
    private final cya c;
    private String g;
    private cxy h = new cxy();
    private volatile cxv e = null;
    private volatile IHOSPSearchServiceCall d = null;

    /* renamed from: a  reason: collision with root package name */
    private final Object f26591a = new Object();
    private IBinder f = new Binder();

    public cxx(Context context) {
        this.c = new cya(context, "com.huawei.searchservice", "com.huawei.searchservice.service.SearchService");
        this.b = context;
        DSLog.init("HwSearchService: Client", 1);
    }

    private List<IndexData> a(int i, SharedMemory sharedMemory, List<IndexData> list) throws ErrnoException {
        return i == SearchResult.SUCCESS.getRetCode() ? Collections.emptyList() : i == SearchResult.FAIL.getRetCode() ? SharedMemoryHelper.readIndexDataList(sharedMemory) : list;
    }

    private void a(boolean z) {
        if (z) {
            if (this.e == null) {
                return;
            }
            this.e.a();
        } else if (this.e == null) {
        } else {
            this.e.b();
        }
    }

    public int a(String str) {
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to getIndexFormVersion, error: searchService is null.", new Object[0]);
            return -1;
        }
        try {
            return this.d.getIndexFormVersion(str, this.b.getPackageName());
        } catch (RemoteException e) {
            DSLog.et("SearchServiceAbility", "Failed to getIndexFormVersion, errMsg: %s", new Object[]{e.getMessage()});
            return -1;
        }
    }

    public int a(String str, int i, List<IndexForm> list) {
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to setIndexForm, error: searchService is null.", new Object[0]);
            return 0;
        }
        try {
            return this.d.setIndexForm(str, i, list, this.b.getPackageName());
        } catch (RemoteException e) {
            DSLog.et("SearchServiceAbility", "Failed to setIndexForm, errMsg: %s", new Object[]{e.getMessage()});
            return 0;
        }
    }

    public SearchableItemAttributeSet a(String str, String str2) {
        SearchableItemAttributeSet searchableItemAttributeSet = new SearchableItemAttributeSet(this.g);
        searchableItemAttributeSet.setUniqueIdentifier(str);
        searchableItemAttributeSet.setGroupId(str2);
        return searchableItemAttributeSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.SharedMemory] */
    public List<IndexData> a(String str, String str2, List<IndexData> list) {
        SharedMemory sharedMemory;
        SharedMemory sharedMemory2;
        SharedMemory sharedMemory3;
        SharedMemory sharedMemory4;
        SharedMemory sharedMemory5;
        List<IndexData> update;
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to update index, error: searchService is null", new Object[0]);
            return list;
        } else if (list == null || list.isEmpty()) {
            DSLog.et("SearchServiceAbility", "Failed to update index, error: indexDataList is null", new Object[0]);
            return list;
        } else {
            ?? currentTimeMillis = System.currentTimeMillis();
            SharedMemory sharedMemory6 = null;
            try {
                try {
                    SharedMemory create = SharedMemory.create("SearchDataSharedMemory", b.MAX_IMAGE_SIZE);
                    try {
                        try {
                            try {
                                if (SharedMemoryHelper.writeIndexDataList(list, create) > 153600) {
                                    sharedMemory6 = SharedMemory.create("SearchFailedIndexSharedMemory", b.MAX_IMAGE_SIZE);
                                    if (this.d == null) {
                                        try {
                                            DSLog.et("SearchServiceAbility", "Failed to update large index, error: searchService is null", new Object[0]);
                                            SharedMemoryHelper.releaseMemory(create);
                                            SharedMemoryHelper.releaseMemory(sharedMemory6);
                                            return list;
                                        } catch (RemoteException e) {
                                            e = e;
                                            sharedMemory4 = sharedMemory6;
                                            sharedMemory6 = create;
                                            DSLog.et("SearchServiceAbility", "Failed to update index, remote error, errMsg: %s", new Object[]{e.getMessage()});
                                            currentTimeMillis = sharedMemory4;
                                            SharedMemoryHelper.releaseMemory(sharedMemory6);
                                            SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                            return list;
                                        } catch (ErrnoException e2) {
                                            e = e2;
                                            sharedMemory3 = sharedMemory6;
                                            sharedMemory6 = create;
                                            DSLog.et("SearchServiceAbility", "Failed to update index, read reply memory error, errMsg: %s", new Object[]{e.getMessage()});
                                            currentTimeMillis = sharedMemory3;
                                            SharedMemoryHelper.releaseMemory(sharedMemory6);
                                            SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                            return list;
                                        } catch (BufferOverflowException e3) {
                                            e = e3;
                                            sharedMemory2 = sharedMemory6;
                                            sharedMemory6 = create;
                                            DSLog.et("SearchServiceAbility", "Failed to update index, the data is out of memory, errMsg: %s", new Object[]{e.getMessage()});
                                            currentTimeMillis = sharedMemory2;
                                            SharedMemoryHelper.releaseMemory(sharedMemory6);
                                            SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                            return list;
                                        }
                                    }
                                    sharedMemory5 = create;
                                    update = a(this.d.updateLarge(str, str2, create, sharedMemory6, this.b.getPackageName()), sharedMemory6, list);
                                    DSLog.it("SearchServiceAbility", "large update " + list.size() + " index cost " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                } else {
                                    sharedMemory5 = create;
                                    if (this.d == null) {
                                        DSLog.et("SearchServiceAbility", "Failed to update index originally, error: searchService is null", new Object[0]);
                                        SharedMemoryHelper.releaseMemory(sharedMemory5);
                                        SharedMemoryHelper.releaseMemory((SharedMemory) null);
                                        return list;
                                    }
                                    update = this.d.update(str, str2, list, this.b.getPackageName());
                                    DSLog.it("SearchServiceAbility", "update " + list.size() + " index cost " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                }
                                SharedMemoryHelper.releaseMemory(sharedMemory5);
                                SharedMemoryHelper.releaseMemory(sharedMemory6);
                                return update;
                            } catch (RemoteException e4) {
                                e = e4;
                                sharedMemory4 = sharedMemory6;
                                sharedMemory6 = create;
                                DSLog.et("SearchServiceAbility", "Failed to update index, remote error, errMsg: %s", new Object[]{e.getMessage()});
                                currentTimeMillis = sharedMemory4;
                                SharedMemoryHelper.releaseMemory(sharedMemory6);
                                SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                return list;
                            } catch (ErrnoException e5) {
                                e = e5;
                                sharedMemory3 = sharedMemory6;
                                sharedMemory6 = create;
                                DSLog.et("SearchServiceAbility", "Failed to update index, read reply memory error, errMsg: %s", new Object[]{e.getMessage()});
                                currentTimeMillis = sharedMemory3;
                                SharedMemoryHelper.releaseMemory(sharedMemory6);
                                SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                return list;
                            } catch (BufferOverflowException e6) {
                                e = e6;
                                sharedMemory2 = sharedMemory6;
                                sharedMemory6 = create;
                                DSLog.et("SearchServiceAbility", "Failed to update index, the data is out of memory, errMsg: %s", new Object[]{e.getMessage()});
                                currentTimeMillis = sharedMemory2;
                                SharedMemoryHelper.releaseMemory(sharedMemory6);
                                SharedMemoryHelper.releaseMemory((SharedMemory) currentTimeMillis);
                                return list;
                            } catch (Throwable th) {
                                th = th;
                                SharedMemoryHelper.releaseMemory(sharedMemory);
                                SharedMemoryHelper.releaseMemory(sharedMemory6);
                                throw th;
                            }
                        } catch (RemoteException e7) {
                            e = e7;
                        } catch (ErrnoException e8) {
                            e = e8;
                        } catch (BufferOverflowException e9) {
                            e = e9;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sharedMemory = create;
                    }
                } catch (RemoteException e10) {
                    e = e10;
                    sharedMemory4 = null;
                } catch (ErrnoException e11) {
                    e = e11;
                    sharedMemory3 = null;
                } catch (BufferOverflowException e12) {
                    e = e12;
                    sharedMemory2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sharedMemory = null;
                }
            } catch (Throwable th4) {
                th = th4;
                sharedMemory = sharedMemory6;
                sharedMemory6 = currentTimeMillis;
            }
        }
    }

    public boolean a(cxv cxvVar) {
        synchronized (this.f26591a) {
            this.e = cxvVar;
            if (this.d != null) {
                a(true);
                return true;
            }
            this.h.a(this.e);
            this.h.a(this.f);
            this.h.a(this.b);
            boolean a2 = this.c.a(this.h);
            if (!a2) {
                DSLog.et("SearchServiceAbility", "Failed to open search service connection.", new Object[0]);
            }
            return a2;
        }
    }

    public List<IndexForm> b(String str) {
        this.g = str;
        return SearchableItemAttributeSet.getCommonIndexForm();
    }
}
