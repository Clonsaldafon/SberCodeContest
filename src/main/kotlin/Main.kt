fun main(args: Array<String>) {

}

data class Category(val categoryId: Int, val name: String)
data class Feature(val featureId: Int, val categoryId: Int, val title: String, var value: Int)

fun getCategories(): List<Category> {
    val test: List<Category> = mutableListOf();
    return test;
}

private fun getFeatures(): List<Feature> {
    val test: List<Feature> = mutableListOf();
    return test;
}

fun mergeCategoriesAndFeatures(categories: List<Category>, features: List<Feature>): List<Any> {
    val result = mutableListOf<Any>();

    for (category in categories) {
        result.add(category);

        for (feature in features) {
            if (feature.categoryId == category.categoryId) {
                result.add(feature);
            }
        }

        result.add(category.categoryId);
    }

    return result;
}
