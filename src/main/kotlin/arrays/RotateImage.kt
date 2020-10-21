package arrays

fun rotateImage(image: Array<IntArray>): Array<IntArray> {
    val rotatedImage = Array(image.size) { IntArray(image.size) }

    for (i in image.indices) {
        for (j in image[i].indices) {
            rotatedImage[i][j] = image[image[i].size - 1 - j][i]
        }
    }

    for (i in image.indices) {
        for (j in image[i].indices) {
            image[i][j] = rotatedImage[i][j]
        }
    }

    return image
}