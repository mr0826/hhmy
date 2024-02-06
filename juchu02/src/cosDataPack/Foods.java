package cosDataPack;

public class Foods extends Shohin {

	/** 味 */
	private String taste;
	/** 内容量 */
	private String net;
	/** 製造国 */
	private String p_country;
	/** 熱量 */
	private String calorie;
	/** 原材料 */
	private String materials;
	/** 栄養成分 */
	private String nutrition;

	/**
	 * 引数なしコンストラクタ。
	 */
	 public Foods() {
		super();
	}

	/**
	 * 味を取得する
	 * @return 味
	 */
	public String getTaste() {
		return taste;
	}

	/**
	 * 味を設定する
	 * @param taste 味
	 */
	public void setTaste(String taste) {
		this.taste = taste;
	}

	/**
	 * 内容量を取得する
	 * @return 内容量
	 */
	public String getNet() {
		return net;
	}

	/**
	 * 内容量を設定する
	 * @param net 内容量
	 */
	public void setNet(String net) {
		this.net = net;
	}

	/**
	 * 製造国を取得する
	 * @return 製造国
	 */
	public String getP_country() {
		return p_country;
	}

	/**
	 * 製造国を設定する
	 * @param p_country 製造国
	 */
	public void setP_country(String p_country) {
		this.p_country = p_country;
	}

	/**
	 * 熱量を取得する
	 * @return 熱量
	 */
	public String getCalorie() {
		return calorie;
	}

	/**
	 * 熱量を設定する
	 * @param calorie 熱量
	 */
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	/**
	 * 原材料を取得する
	 * @return 原材料
	 */
	public String getMaterials() {
		return materials;
	}

	/**
	 * 原材料を設定する
	 * @param materials 原材料
	 */
	public void setMaterials(String materials) {
		this.materials = materials;
	}

	/**
	 * 栄養成分を取得する
	 * @return 栄養成分
	 */
	public String getNutrition() {
		return nutrition;
	}

	/**
	 * 栄養成分を設定する
	 * @param nutrition 栄養成分
	 */
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}


}
