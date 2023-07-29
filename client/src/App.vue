<template>
  <v-app>
    <v-main>
      <Sample/>
    </v-main>
  </v-app>
</template>

<script lang="ts">
import Sample from './components/sample.vue';

export default {
  name: 'App',

  components: {
    Sample,
  },

  data () {
    return {
      //
    }
  },
}
</script>
