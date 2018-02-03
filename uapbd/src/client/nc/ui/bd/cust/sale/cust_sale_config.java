package nc.ui.bd.cust.sale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.ui.uif2.factory.AbstractJavaBeanDefinition;

public class cust_sale_config extends AbstractJavaBeanDefinition {
	private Map<String, Object> context = new HashMap();

	public nc.ui.bd.uitabextend.DefaultUIExtComponent getCust_sale() {
		if (context.get("cust_sale") != null)
			return (nc.ui.bd.uitabextend.DefaultUIExtComponent) context
					.get("cust_sale");
		nc.ui.bd.uitabextend.DefaultUIExtComponent bean = new nc.ui.bd.uitabextend.DefaultUIExtComponent();
		context.put("cust_sale", bean);
		bean.setActions(getManagedList0());
		bean.setExComponent(getCustSaleListView());
		bean.setClosingListener(getCustSaleClosingListener());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList0() {
		List list = new ArrayList();
		list.add(getCustSaleEditAction());
		list.add(getCustSaleDeleteAction());
		list.add(getCustaddressAction());
		list.add((javax.swing.Action) findBeanInUIF2BeanFactory("separatorAction"));
		list.add(getCustSaleRefreshAction());
		list.add((javax.swing.Action) findBeanInUIF2BeanFactory("separatorAction"));
		list.add(getCustSaleListPrintActionGroup());
		return list;
	}

	public nc.ui.uif2.editor.UserdefitemUIPreprocessor getUserdefitemSalePreprocessor() {
		if (context.get("userdefitemSalePreprocessor") != null)
			return (nc.ui.uif2.editor.UserdefitemUIPreprocessor) context
					.get("userdefitemSalePreprocessor");
		nc.ui.uif2.editor.UserdefitemUIPreprocessor bean = new nc.ui.uif2.editor.UserdefitemUIPreprocessor();
		context.put("userdefitemSalePreprocessor", bean);
		bean.setContainer((nc.ui.uif2.userdefitem.UserDefItemContainer) findBeanInUIF2BeanFactory("userdefitemContainer"));
		bean.setParams(getManagedList1());
		bean.init();
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList1() {
		List list = new ArrayList();
		list.add(getQueryParam_7aec69());
		return list;
	}

	private nc.ui.uif2.userdefitem.QueryParam getQueryParam_7aec69() {
		if (context.get("nc.ui.uif2.userdefitem.QueryParam#7aec69") != null)
			return (nc.ui.uif2.userdefitem.QueryParam) context
					.get("nc.ui.uif2.userdefitem.QueryParam#7aec69");
		nc.ui.uif2.userdefitem.QueryParam bean = new nc.ui.uif2.userdefitem.QueryParam();
		context.put("nc.ui.uif2.userdefitem.QueryParam#7aec69", bean);
		bean.setMdfullname("uap.custsale");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.cust.sale.model.CustSaleAppModelService getCustSaleAppModelsService() {
		if (context.get("custSaleAppModelsService") != null)
			return (nc.ui.bd.cust.sale.model.CustSaleAppModelService) context
					.get("custSaleAppModelsService");
		nc.ui.bd.cust.sale.model.CustSaleAppModelService bean = new nc.ui.bd.cust.sale.model.CustSaleAppModelService();
		context.put("custSaleAppModelsService", bean);
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.pub.orginfo.model.OrgInfoBillManageModel getCustSaleAppModel() {
		if (context.get("custSaleAppModel") != null)
			return (nc.ui.bd.pub.orginfo.model.OrgInfoBillManageModel) context
					.get("custSaleAppModel");
		nc.ui.bd.pub.orginfo.model.OrgInfoBillManageModel bean = new nc.ui.bd.pub.orginfo.model.OrgInfoBillManageModel();
		context.put("custSaleAppModel", bean);
		bean.setService(getCustSaleAppModelsService());
		bean.setBusinessObjectAdapterFactory(getGeneralBDObjectAdapterFactory_36f435());
		bean.setContext((nc.vo.uif2.LoginContext) findBeanInUIF2BeanFactory("context"));
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private nc.vo.bd.meta.GeneralBDObjectAdapterFactory getGeneralBDObjectAdapterFactory_36f435() {
		if (context.get("nc.vo.bd.meta.GeneralBDObjectAdapterFactory#36f435") != null)
			return (nc.vo.bd.meta.GeneralBDObjectAdapterFactory) context
					.get("nc.vo.bd.meta.GeneralBDObjectAdapterFactory#36f435");
		nc.vo.bd.meta.GeneralBDObjectAdapterFactory bean = new nc.vo.bd.meta.GeneralBDObjectAdapterFactory();
		context.put("nc.vo.bd.meta.GeneralBDObjectAdapterFactory#36f435", bean);
		bean.setMode("VO");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.cust.sale.model.CustSaleDataManager getCustSaleModelDataManager() {
		if (context.get("custSaleModelDataManager") != null)
			return (nc.ui.bd.cust.sale.model.CustSaleDataManager) context
					.get("custSaleModelDataManager");
		nc.ui.bd.cust.sale.model.CustSaleDataManager bean = new nc.ui.bd.cust.sale.model.CustSaleDataManager();
		context.put("custSaleModelDataManager", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.pub.orginfo.model.OrgInfoMediator getCustSaleMediator() {
		if (context.get("custSaleMediator") != null)
			return (nc.ui.bd.pub.orginfo.model.OrgInfoMediator) context
					.get("custSaleMediator");
		nc.ui.bd.pub.orginfo.model.OrgInfoMediator bean = new nc.ui.bd.pub.orginfo.model.OrgInfoMediator();
		context.put("custSaleMediator", bean);
		bean.setBaseModel((nc.ui.uif2.model.AbstractUIAppModel) findBeanInUIF2BeanFactory("baseinfoModel"));
		bean.setModelDataManager(getCustSaleModelDataManager());
		bean.setOrgInfoModel(getCustSaleAppModel());
		bean.setOrgInfoPanel(getCustSaleListView());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.cust.sale.view.CustSaleListView getCustSaleListView() {
		if (context.get("custSaleListView") != null)
			return (nc.ui.bd.cust.sale.view.CustSaleListView) context
					.get("custSaleListView");
		nc.ui.bd.cust.sale.view.CustSaleListView bean = new nc.ui.bd.cust.sale.view.CustSaleListView();
		context.put("custSaleListView", bean);
		bean.setTemplateContainer((nc.ui.uif2.editor.TemplateContainer) findBeanInUIF2BeanFactory("templateContainer"));
		bean.setModel(getCustSaleAppModel());
		bean.setNodekey("sale");
		bean.setName(getI18nFB_1dac4b5());
		bean.setUserdefitemListPreparator(getUserdefitemContainerListPreparator_3801a3());
		bean.initUI();
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private java.lang.String getI18nFB_1dac4b5() {
		if (context.get("nc.ui.uif2.I18nFB#1dac4b5") != null)
			return (java.lang.String) context.get("nc.ui.uif2.I18nFB#1dac4b5");
		nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
		context.put("&nc.ui.uif2.I18nFB#1dac4b5", bean);
		bean.setResDir("10140cub");
		bean.setDefaultValue("销售信息");
		bean.setResId("110140cub0010");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		try {
			Object product = bean.getObject();
			context.put("nc.ui.uif2.I18nFB#1dac4b5", product);
			return (java.lang.String) product;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private nc.ui.uif2.editor.UserdefitemContainerListPreparator getUserdefitemContainerListPreparator_3801a3() {
		if (context
				.get("nc.ui.uif2.editor.UserdefitemContainerListPreparator#3801a3") != null)
			return (nc.ui.uif2.editor.UserdefitemContainerListPreparator) context
					.get("nc.ui.uif2.editor.UserdefitemContainerListPreparator#3801a3");
		nc.ui.uif2.editor.UserdefitemContainerListPreparator bean = new nc.ui.uif2.editor.UserdefitemContainerListPreparator();
		context.put(
				"nc.ui.uif2.editor.UserdefitemContainerListPreparator#3801a3",
				bean);
		bean.setContainer((nc.ui.uif2.userdefitem.UserDefItemContainer) findBeanInUIF2BeanFactory("userdefitemContainer"));
		bean.setParams(getManagedList2());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList2() {
		List list = new ArrayList();
		list.add(getUserdefQueryParam_1a87b50());
		return list;
	}

	private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_1a87b50() {
		if (context.get("nc.ui.uif2.editor.UserdefQueryParam#1a87b50") != null)
			return (nc.ui.uif2.editor.UserdefQueryParam) context
					.get("nc.ui.uif2.editor.UserdefQueryParam#1a87b50");
		nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
		context.put("nc.ui.uif2.editor.UserdefQueryParam#1a87b50", bean);
		bean.setMdfullname("uap.custsale");
		bean.setPos(0);
		bean.setPrefix("def");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.cust.sale.view.CustSaleEditor getCustSaleEditor() {
		if (context.get("custSaleEditor") != null)
			return (nc.ui.bd.cust.sale.view.CustSaleEditor) context
					.get("custSaleEditor");
		nc.ui.bd.cust.sale.view.CustSaleEditor bean = new nc.ui.bd.cust.sale.view.CustSaleEditor();
		context.put("custSaleEditor", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setTemplateContainer((nc.ui.uif2.editor.TemplateContainer) findBeanInUIF2BeanFactory("templateContainer"));
		bean.setNodekey("sale");
		bean.setBodyActionMap(getManagedMap0());
		bean.setUserdefitemPreparator(getUserdefitemContainerPreparator_f71ec8());
		bean.setActions(getManagedList5());
		bean.initUI();
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private Map getManagedMap0() {
		Map map = new HashMap();
		map.put("custaddress", getManagedList3());
		return map;
	}

	private List getManagedList3() {
		List list = new ArrayList();
		list.add(getAddLineAction_f39545());
		list.add(getDelLineAction_1ccf3dc());
		return list;
	}

	private nc.ui.uif2.actions.AddLineAction getAddLineAction_f39545() {
		if (context.get("nc.ui.uif2.actions.AddLineAction#f39545") != null)
			return (nc.ui.uif2.actions.AddLineAction) context
					.get("nc.ui.uif2.actions.AddLineAction#f39545");
		nc.ui.uif2.actions.AddLineAction bean = new nc.ui.uif2.actions.AddLineAction();
		context.put("nc.ui.uif2.actions.AddLineAction#f39545", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setCardpanel(getCustSaleEditor());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private nc.ui.uif2.actions.DelLineAction getDelLineAction_1ccf3dc() {
		if (context.get("nc.ui.uif2.actions.DelLineAction#1ccf3dc") != null)
			return (nc.ui.uif2.actions.DelLineAction) context
					.get("nc.ui.uif2.actions.DelLineAction#1ccf3dc");
		nc.ui.uif2.actions.DelLineAction bean = new nc.ui.uif2.actions.DelLineAction();
		context.put("nc.ui.uif2.actions.DelLineAction#1ccf3dc", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setCardpanel(getCustSaleEditor());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private nc.ui.uif2.editor.UserdefitemContainerPreparator getUserdefitemContainerPreparator_f71ec8() {
		if (context
				.get("nc.ui.uif2.editor.UserdefitemContainerPreparator#f71ec8") != null)
			return (nc.ui.uif2.editor.UserdefitemContainerPreparator) context
					.get("nc.ui.uif2.editor.UserdefitemContainerPreparator#f71ec8");
		nc.ui.uif2.editor.UserdefitemContainerPreparator bean = new nc.ui.uif2.editor.UserdefitemContainerPreparator();
		context.put("nc.ui.uif2.editor.UserdefitemContainerPreparator#f71ec8",
				bean);
		bean.setContainer((nc.ui.uif2.userdefitem.UserDefItemContainer) findBeanInUIF2BeanFactory("userdefitemContainer"));
		bean.setParams(getManagedList4());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList4() {
		List list = new ArrayList();
		list.add(getUserdefQueryParam_9e0f30());
		return list;
	}

	private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_9e0f30() {
		if (context.get("nc.ui.uif2.editor.UserdefQueryParam#9e0f30") != null)
			return (nc.ui.uif2.editor.UserdefQueryParam) context
					.get("nc.ui.uif2.editor.UserdefQueryParam#9e0f30");
		nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
		context.put("nc.ui.uif2.editor.UserdefQueryParam#9e0f30", bean);
		bean.setMdfullname("uap.custsale");
		bean.setPos(0);
		bean.setPrefix("def");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList5() {
		List list = new ArrayList();
		list.add(getCustSaleFirstLineAction());
		list.add(getCustSalePreLineAction());
		list.add(getCustSaleNextLineAction());
		list.add(getCustSaleLastLineAction());
		return list;
	}

	public nc.ui.bd.pub.orginfo.model.OrgInfoCardDialogMediator getCustSaleDialogMediator() {
		if (context.get("custSaleDialogMediator") != null)
			return (nc.ui.bd.pub.orginfo.model.OrgInfoCardDialogMediator) context
					.get("custSaleDialogMediator");
		nc.ui.bd.pub.orginfo.model.OrgInfoCardDialogMediator bean = new nc.ui.bd.pub.orginfo.model.OrgInfoCardDialogMediator();
		context.put("custSaleDialogMediator", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setDialogContainer(getCustSaleDialogContainer());
		bean.setName(getI18nFB_60c26());
		bean.setClosingListener(getCustSaleClosingListener());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private java.lang.String getI18nFB_60c26() {
		if (context.get("nc.ui.uif2.I18nFB#60c26") != null)
			return (java.lang.String) context.get("nc.ui.uif2.I18nFB#60c26");
		nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
		context.put("&nc.ui.uif2.I18nFB#60c26", bean);
		bean.setResDir("10140cub");
		bean.setDefaultValue("销售信息");
		bean.setResId("110140cub0010");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		try {
			Object product = bean.getObject();
			context.put("nc.ui.uif2.I18nFB#60c26", product);
			return (java.lang.String) product;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public nc.ui.uif2.TangramContainer getCustSaleDialogContainer() {
		if (context.get("custSaleDialogContainer") != null)
			return (nc.ui.uif2.TangramContainer) context
					.get("custSaleDialogContainer");
		nc.ui.uif2.TangramContainer bean = new nc.ui.uif2.TangramContainer();
		context.put("custSaleDialogContainer", bean);
		bean.setConstraints(getManagedList6());
		bean.setActions(getManagedList7());
		bean.setEditActions(getManagedList8());
		bean.setModel(getCustSaleAppModel());
		bean.initUI();
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList6() {
		List list = new ArrayList();
		list.add(getTangramLayoutConstraint_15e3576());
		return list;
	}

	private nc.ui.uif2.tangramlayout.TangramLayoutConstraint getTangramLayoutConstraint_15e3576() {
		if (context
				.get("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#15e3576") != null)
			return (nc.ui.uif2.tangramlayout.TangramLayoutConstraint) context
					.get("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#15e3576");
		nc.ui.uif2.tangramlayout.TangramLayoutConstraint bean = new nc.ui.uif2.tangramlayout.TangramLayoutConstraint();
		context.put("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#15e3576",
				bean);
		bean.setNewComponent(getCustSaleEditor());
		bean.setNewComponentName(getI18nFB_107c617());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private java.lang.String getI18nFB_107c617() {
		if (context.get("nc.ui.uif2.I18nFB#107c617") != null)
			return (java.lang.String) context.get("nc.ui.uif2.I18nFB#107c617");
		nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
		context.put("&nc.ui.uif2.I18nFB#107c617", bean);
		bean.setResDir("10140cub");
		bean.setDefaultValue("销售信息");
		bean.setResId("110140cub0010");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		try {
			Object product = bean.getObject();
			context.put("nc.ui.uif2.I18nFB#107c617", product);
			return (java.lang.String) product;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private List getManagedList7() {
		List list = new ArrayList();
		list.add(getCustSaleEditAction());
		list.add(getCustSaleDeleteAction());
		list.add((javax.swing.Action) findBeanInUIF2BeanFactory("separatorAction"));
		list.add(getCustSaleRefreshSingleAction());
		list.add((javax.swing.Action) findBeanInUIF2BeanFactory("separatorAction"));
		list.add(getCustSalePrintActionGroup());
		return list;
	}

	private List getManagedList8() {
		List list = new ArrayList();
		list.add(getCustSaleSaveAction());
		list.add((javax.swing.Action) findBeanInUIF2BeanFactory("separatorAction"));
		list.add(getCustSaleCancelAction());
		return list;
	}

	public nc.ui.uif2.actions.EditAction getCustSaleEditAction() {
		if (context.get("custSaleEditAction") != null)
			return (nc.ui.uif2.actions.EditAction) context
					.get("custSaleEditAction");
		nc.ui.uif2.actions.EditAction bean = new nc.ui.uif2.actions.EditAction();
		context.put("custSaleEditAction", bean);
		bean.setCode("SaEdit");
		bean.setModel(getCustSaleAppModel());
		bean.setResourceCode("custsaleclass");
		bean.setMdOperateCode("edit");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.DeleteAction getCustSaleDeleteAction() {
		if (context.get("custSaleDeleteAction") != null)
			return (nc.ui.uif2.actions.DeleteAction) context
					.get("custSaleDeleteAction");
		nc.ui.uif2.actions.DeleteAction bean = new nc.ui.uif2.actions.DeleteAction();
		context.put("custSaleDeleteAction", bean);
		bean.setCode("SaDelete");
		bean.setModel(getCustSaleAppModel());
		bean.setResourceCode("custsaleclass");
		bean.setMdOperateCode("delete");
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.cust.baseinfo.action.CustAddressAction getCustaddressAction() {
		if (context.get("custaddressAction") != null)
			return (nc.ui.bd.cust.baseinfo.action.CustAddressAction) context
					.get("custaddressAction");
		nc.ui.bd.cust.baseinfo.action.CustAddressAction bean = new nc.ui.bd.cust.baseinfo.action.CustAddressAction();
		context.put("custaddressAction", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setFunnode("10140CAD");
		bean.setRefreshSingleAction(getCustSaleRefreshSingleAction());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.RefreshAllAction getCustSaleRefreshAction() {
		if (context.get("custSaleRefreshAction") != null)
			return (nc.ui.uif2.actions.RefreshAllAction) context
					.get("custSaleRefreshAction");
		nc.ui.uif2.actions.RefreshAllAction bean = new nc.ui.uif2.actions.RefreshAllAction();
		context.put("custSaleRefreshAction", bean);
		bean.setCode("SaRefresh");
		bean.setModel(getCustSaleAppModel());
		bean.setManager(getCustSaleModelDataManager());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.RefreshSingleAction getCustSaleRefreshSingleAction() {
		if (context.get("custSaleRefreshSingleAction") != null)
			return (nc.ui.uif2.actions.RefreshSingleAction) context
					.get("custSaleRefreshSingleAction");
		nc.ui.uif2.actions.RefreshSingleAction bean = new nc.ui.uif2.actions.RefreshSingleAction();
		context.put("custSaleRefreshSingleAction", bean);
		bean.setCode("SaRefresh");
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.SaveAction getCustSaleSaveAction() {
		if (context.get("custSaleSaveAction") != null)
			return (nc.ui.uif2.actions.SaveAction) context
					.get("custSaleSaveAction");
		nc.ui.uif2.actions.SaveAction bean = new nc.ui.uif2.actions.SaveAction();
		context.put("custSaleSaveAction", bean);
		bean.setCode("SaSave");
		bean.setModel(getCustSaleAppModel());
		bean.setEditor(getCustSaleEditor());
		bean.setInterceptor(getCompositeActionInterceptor());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.pub.actions.CompositeActionInterceptor getCompositeActionInterceptor() {
		if (context.get("compositeActionInterceptor") != null)
			return (nc.ui.bd.pub.actions.CompositeActionInterceptor) context
					.get("compositeActionInterceptor");
		nc.ui.bd.pub.actions.CompositeActionInterceptor bean = new nc.ui.bd.pub.actions.CompositeActionInterceptor();
		context.put("compositeActionInterceptor", bean);
		bean.setInterceptors(getManagedList9());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList9() {
		List list = new ArrayList();
		list.add(getBdSaveActionInterceptor());
		return list;
	}

	public nc.ui.bd.pub.actions.BDSaveActionInterceptor getBdSaveActionInterceptor() {
		if (context.get("bdSaveActionInterceptor") != null)
			return (nc.ui.bd.pub.actions.BDSaveActionInterceptor) context
					.get("bdSaveActionInterceptor");
		nc.ui.bd.pub.actions.BDSaveActionInterceptor bean = new nc.ui.bd.pub.actions.BDSaveActionInterceptor();
		context.put("bdSaveActionInterceptor", bean);
		bean.setEditor(getCustSaleEditor());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.CancelAction getCustSaleCancelAction() {
		if (context.get("custSaleCancelAction") != null)
			return (nc.ui.uif2.actions.CancelAction) context
					.get("custSaleCancelAction");
		nc.ui.uif2.actions.CancelAction bean = new nc.ui.uif2.actions.CancelAction();
		context.put("custSaleCancelAction", bean);
		bean.setCode("SaCancel");
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.funcnode.ui.action.GroupAction getCustSaleListPrintActionGroup() {
		if (context.get("custSaleListPrintActionGroup") != null)
			return (nc.funcnode.ui.action.GroupAction) context
					.get("custSaleListPrintActionGroup");
		nc.funcnode.ui.action.GroupAction bean = new nc.funcnode.ui.action.GroupAction();
		context.put("custSaleListPrintActionGroup", bean);
		bean.setCode("SaPrintGroup");
		bean.setActions(getManagedList10());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList10() {
		List list = new ArrayList();
		list.add(getCustSaleListTempletPrintAction());
		list.add(getCustSaleListTempletPreviewAction());
		list.add(getCustSaleListOutputAction());
		return list;
	}

	public nc.ui.uif2.actions.TemplatePreviewAction getCustSaleListTempletPreviewAction() {
		if (context.get("custSaleListTempletPreviewAction") != null)
			return (nc.ui.uif2.actions.TemplatePreviewAction) context
					.get("custSaleListTempletPreviewAction");
		nc.ui.uif2.actions.TemplatePreviewAction bean = new nc.ui.uif2.actions.TemplatePreviewAction();
		context.put("custSaleListTempletPreviewAction", bean);
		bean.setCode("SaTempPreview");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salelist");
		bean.setDatasource(getCustSaleListardDataSource());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.TemplatePrintAction getCustSaleListTempletPrintAction() {
		if (context.get("custSaleListTempletPrintAction") != null)
			return (nc.ui.uif2.actions.TemplatePrintAction) context
					.get("custSaleListTempletPrintAction");
		nc.ui.uif2.actions.TemplatePrintAction bean = new nc.ui.uif2.actions.TemplatePrintAction();
		context.put("custSaleListTempletPrintAction", bean);
		bean.setCode("SaTempPrint");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salelist");
		bean.setDatasource(getCustSaleListardDataSource());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.OutputAction getCustSaleListOutputAction() {
		if (context.get("custSaleListOutputAction") != null)
			return (nc.ui.uif2.actions.OutputAction) context
					.get("custSaleListOutputAction");
		nc.ui.uif2.actions.OutputAction bean = new nc.ui.uif2.actions.OutputAction();
		context.put("custSaleListOutputAction", bean);
		bean.setCode("SaOutput");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salelist");
		bean.setDatasource(getCustSaleListardDataSource());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.pub.actions.print.MetaDataAllDatasSource getCustSaleListardDataSource() {
		if (context.get("custSaleListardDataSource") != null)
			return (nc.ui.bd.pub.actions.print.MetaDataAllDatasSource) context
					.get("custSaleListardDataSource");
		nc.ui.bd.pub.actions.print.MetaDataAllDatasSource bean = new nc.ui.bd.pub.actions.print.MetaDataAllDatasSource();
		context.put("custSaleListardDataSource", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.funcnode.ui.action.GroupAction getCustSalePrintActionGroup() {
		if (context.get("custSalePrintActionGroup") != null)
			return (nc.funcnode.ui.action.GroupAction) context
					.get("custSalePrintActionGroup");
		nc.funcnode.ui.action.GroupAction bean = new nc.funcnode.ui.action.GroupAction();
		context.put("custSalePrintActionGroup", bean);
		bean.setCode("SaPrintGroup");
		bean.setActions(getManagedList11());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	private List getManagedList11() {
		List list = new ArrayList();
		list.add(getCustSaleTempletPrintAction());
		list.add(getCustSaleTempletPreviewAction());
		list.add(getCustSaleOutputAction());
		return list;
	}

	public nc.ui.uif2.actions.TemplatePreviewAction getCustSaleTempletPreviewAction() {
		if (context.get("custSaleTempletPreviewAction") != null)
			return (nc.ui.uif2.actions.TemplatePreviewAction) context
					.get("custSaleTempletPreviewAction");
		nc.ui.uif2.actions.TemplatePreviewAction bean = new nc.ui.uif2.actions.TemplatePreviewAction();
		context.put("custSaleTempletPreviewAction", bean);
		bean.setCode("SaTempPreview");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salecard");
		bean.setDatasource(getCustSaleCardDataSource());
		bean.setPrintDlgParentConatiner(getCustSaleDialogContainer());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.TemplatePrintAction getCustSaleTempletPrintAction() {
		if (context.get("custSaleTempletPrintAction") != null)
			return (nc.ui.uif2.actions.TemplatePrintAction) context
					.get("custSaleTempletPrintAction");
		nc.ui.uif2.actions.TemplatePrintAction bean = new nc.ui.uif2.actions.TemplatePrintAction();
		context.put("custSaleTempletPrintAction", bean);
		bean.setCode("SaTempPrint");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salecard");
		bean.setDatasource(getCustSaleCardDataSource());
		bean.setPrintDlgParentConatiner(getCustSaleDialogContainer());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.OutputAction getCustSaleOutputAction() {
		if (context.get("custSaleOutputAction") != null)
			return (nc.ui.uif2.actions.OutputAction) context
					.get("custSaleOutputAction");
		nc.ui.uif2.actions.OutputAction bean = new nc.ui.uif2.actions.OutputAction();
		context.put("custSaleOutputAction", bean);
		bean.setCode("SaOutput");
		bean.setModel(getCustSaleAppModel());
		bean.setNodeKey("salecard");
		bean.setDatasource(getCustSaleCardDataSource());
		bean.setPrintDlgParentConatiner(getCustSaleDialogContainer());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.bd.pub.actions.print.MetaDataSingleSelectDataSource getCustSaleCardDataSource() {
		if (context.get("custSaleCardDataSource") != null)
			return (nc.ui.bd.pub.actions.print.MetaDataSingleSelectDataSource) context
					.get("custSaleCardDataSource");
		nc.ui.bd.pub.actions.print.MetaDataSingleSelectDataSource bean = new nc.ui.bd.pub.actions.print.MetaDataSingleSelectDataSource();
		context.put("custSaleCardDataSource", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.FirstLineAction getCustSaleFirstLineAction() {
		if (context.get("custSaleFirstLineAction") != null)
			return (nc.ui.uif2.actions.FirstLineAction) context
					.get("custSaleFirstLineAction");
		nc.ui.uif2.actions.FirstLineAction bean = new nc.ui.uif2.actions.FirstLineAction();
		context.put("custSaleFirstLineAction", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.NextLineAction getCustSaleNextLineAction() {
		if (context.get("custSaleNextLineAction") != null)
			return (nc.ui.uif2.actions.NextLineAction) context
					.get("custSaleNextLineAction");
		nc.ui.uif2.actions.NextLineAction bean = new nc.ui.uif2.actions.NextLineAction();
		context.put("custSaleNextLineAction", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.PreLineAction getCustSalePreLineAction() {
		if (context.get("custSalePreLineAction") != null)
			return (nc.ui.uif2.actions.PreLineAction) context
					.get("custSalePreLineAction");
		nc.ui.uif2.actions.PreLineAction bean = new nc.ui.uif2.actions.PreLineAction();
		context.put("custSalePreLineAction", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.actions.LastLineAction getCustSaleLastLineAction() {
		if (context.get("custSaleLastLineAction") != null)
			return (nc.ui.uif2.actions.LastLineAction) context
					.get("custSaleLastLineAction");
		nc.ui.uif2.actions.LastLineAction bean = new nc.ui.uif2.actions.LastLineAction();
		context.put("custSaleLastLineAction", bean);
		bean.setModel(getCustSaleAppModel());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

	public nc.ui.uif2.FunNodeClosingHandler getCustSaleClosingListener() {
		if (context.get("custSaleClosingListener") != null)
			return (nc.ui.uif2.FunNodeClosingHandler) context
					.get("custSaleClosingListener");
		nc.ui.uif2.FunNodeClosingHandler bean = new nc.ui.uif2.FunNodeClosingHandler();
		context.put("custSaleClosingListener", bean);
		bean.setModel(getCustSaleAppModel());
		bean.setSaveaction(getCustSaleSaveAction());
		bean.setCancelaction(getCustSaleCancelAction());
		setBeanFacotryIfBeanFacatoryAware(bean);
		invokeInitializingBean(bean);
		return bean;
	}

}
